package com.example.workshopCRM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/addcar")
    public String addCar() {

        return "/newcar";
    }

    @GetMapping("/allcars")
    public String allCars() {

        return "/allcars";
    }
}
