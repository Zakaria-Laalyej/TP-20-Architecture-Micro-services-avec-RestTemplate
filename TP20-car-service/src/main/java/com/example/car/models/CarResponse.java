package com.example.car.models;

public class CarResponse {
    private Long id;
    private String brand;
    private String model;
    private String matricule;
    private Client client;

    public CarResponse() {
    }

    public CarResponse(Long id, String brand, String model, String matricule, Client client) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.matricule = matricule;
        this.client = client;
    }

    public static CarResponseBuilder builder() {
        return new CarResponseBuilder();
    }

    public static class CarResponseBuilder {
        private Long id;
        private String brand;
        private String model;
        private String matricule;
        private Client client;

        public CarResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CarResponseBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarResponseBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarResponseBuilder matricule(String matricule) {
            this.matricule = matricule;
            return this;
        }

        public CarResponseBuilder client(Client client) {
            this.client = client;
            return this;
        }

        public CarResponse build() {
            return new CarResponse(id, brand, model, matricule, client);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
