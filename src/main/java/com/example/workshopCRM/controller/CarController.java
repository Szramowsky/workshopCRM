package com.example.workshopCRM.controller;

import com.example.workshopCRM.model.Car;
import com.example.workshopCRM.repository.CarRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CarController {

    private CarRepo carRepo;

    public CarController(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @GetMapping("/addcar")
    public String addCar() {

        return "/newcar";
    }

    @GetMapping("/allcars")
    public String allCars(Model model) {
        List<Car> carList = carRepo.findAll();
        model.addAttribute("carlist", carList);
        return "/allcars";
    }
}
