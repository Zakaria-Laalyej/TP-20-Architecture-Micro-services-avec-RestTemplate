package com.example.client;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
        System.out.println("=================================================");
        System.out.println(" SERVICE-CLIENT demarre sur http://localhost:8081");
        System.out.println("=================================================");
    }

    @Bean
    CommandLineRunner initializeData(ClientRepository clientRepository) {
        return args -> {
            if (clientRepository.count() == 0) {
                clientRepository.save(new Client(null, "Nabil", 23f));
                clientRepository.save(new Client(null, "Ali", 21f));
                clientRepository.save(new Client(null, "Maria", 22f));
                System.out.println("Donnees initiales clients inserees avec succes !");
            }
        };
    }
}
