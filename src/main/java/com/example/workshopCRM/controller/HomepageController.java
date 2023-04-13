package com.example.workshopCRM.controller;

import com.example.workshopCRM.model.Car;
import com.example.workshopCRM.repository.CarRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomepageController {

    private CarRepo carRepo;

    public HomepageController(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @GetMapping("")
    public String homepage(Model model) {
        List<Car> carList = carRepo.findAll();
        model.addAttribute("carList", carList);
        return "homepage";
    }
}
