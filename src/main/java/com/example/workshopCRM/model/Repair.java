package com.example.workshopCRM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Repairs")
public class Repair {
    private UUID uuid;
    @ManyToOne
    @JoinColumn(name = "car_uuid")
    private Car car;
    private Date date;
    private Double cost;
    private String message;
}
