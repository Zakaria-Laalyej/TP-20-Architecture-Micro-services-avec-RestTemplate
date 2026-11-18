package com.example.car.services;

import com.example.car.entities.Car;
import com.example.car.models.CarResponse;
import com.example.car.models.Client;
import com.example.car.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private RestTemplate restTemplate;

    // URL du service client via la Gateway (ou direct en fallback)
    private static final String CLIENT_GATEWAY_URL = "http://localhost:8888/SERVICE-CLIENT/api/client/";
    private static final String CLIENT_DIRECT_URL = "http://localhost:8081/api/client/";

    public List<CarResponse> findAll() {
        List<Car> cars = carRepository.findAll();
        return cars.stream()
                .map(this::mapToCarResponse)
                .collect(Collectors.toList());
    }

    public CarResponse findById(Long id) throws Exception {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new Exception("Voiture non trouvee avec l'ID: " + id));
        return mapToCarResponse(car);
    }

    private CarResponse mapToCarResponse(Car car) {
        Client client = null;
        if (car.getClient_id() != null) {
            try {
                // Tentative d'appel via la Gateway
                client = restTemplate.getForObject(CLIENT_GATEWAY_URL + car.getClient_id(), Client.class);
            } catch (Exception e1) {
                try {
                    // Fallback direct vers SERVICE-CLIENT sur port 8081
                    client = restTemplate.getForObject(CLIENT_DIRECT_URL + car.getClient_id(), Client.class);
                } catch (Exception e2) {
                    System.err.println("Impossible de recuperer le client " + car.getClient_id() + ": " + e2.getMessage());
                }
            }
        }

        return CarResponse.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .model(car.getModel())
                .matricule(car.getMatricule())
                .client(client)
                .build();
    }
}
