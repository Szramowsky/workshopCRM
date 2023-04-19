package com.example.workshopCRM.controller;


import com.example.workshopCRM.model.Car;
import com.example.workshopCRM.model.Repair;
import com.example.workshopCRM.repository.RepairRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class RepairController {

    private RepairRepo repairRepo;

    public RepairController(RepairRepo repairRepo) {
        this.repairRepo = repairRepo;
    }

    @GetMapping("/addrepair")
    public String addRepair(Model model) {
        model.addAttribute("repair", new Repair());
        return "/newrepair";
    }

    @GetMapping("/allrepairs")
    public String allRepairsForCar(Model model, Car car) {
        List<Repair> repairList = repairRepo.findAllByCar(car);
        model.addAttribute("repairs", repairList);
        return "/allrepairs";
    }
}
