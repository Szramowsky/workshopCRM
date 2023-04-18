package com.example.workshopCRM.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepairController {

    @GetMapping("/addrepair")
    public String addRepair() {

        return "/newrepair";
    }
}
