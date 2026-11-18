package com.example.car.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Client {
    private Long id;

    @JsonAlias({"nom", "name"})
    private String name;

    private Float age;

    public Client() {
    }

    public Client(Long id, String name, Float age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }
}
