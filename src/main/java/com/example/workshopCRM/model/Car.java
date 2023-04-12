package com.example.workshopCRM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.UUID;


@Entity
@Table(name = "Cars")
public class Car {
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
