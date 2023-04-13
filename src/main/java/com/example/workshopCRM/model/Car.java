package com.example.workshopCRM.model;

import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "Car")
public class Car {
    @Id
    private UUID uuid;
    @OneToOne
    @JoinColumn(name = "client_uuid")
    private Client client;
    private String brand;
    private String model;
    private Integer year;
    private String licensePlates;
    private String engine;
    private String VIN;
}
