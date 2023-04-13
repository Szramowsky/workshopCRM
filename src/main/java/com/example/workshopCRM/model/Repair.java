package com.example.workshopCRM.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "Repair")
public class Repair {
    @Id
    private UUID uuid;
    @ManyToOne
    @JoinColumn(name = "car_uuid")
    private Car car;
    private Date date;
    private Double cost;
    private String message;
}
