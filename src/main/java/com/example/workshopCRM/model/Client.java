package com.example.workshopCRM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Clients")
public class Client {
    @Id
    private UUID uuid;
    private String name;
    private String phoneNumber;
    private String NIP;
    private String address;
    private String city;
}
