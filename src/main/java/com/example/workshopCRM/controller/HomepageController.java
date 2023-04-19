package com.example.workshopCRM.controller;

import com.example.workshopCRM.model.Car;
import com.example.workshopCRM.repository.CarRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomepageController {

    @RequestMapping("")
    public String test() {
        return "page/homepage";
    }


}
