package com.example.workshopCRM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Setter
@Getter
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
