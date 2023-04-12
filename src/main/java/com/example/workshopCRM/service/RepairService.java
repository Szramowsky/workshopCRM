package com.example.workshopCRM.service;

import com.example.workshopCRM.model.Repair;
import com.example.workshopCRM.repository.RepairRepo;
import org.springframework.stereotype.Service;

@Service
public class RepairService {
    private RepairRepo repairRepo;

    public RepairService(RepairRepo repairRepo) {
        this.repairRepo = repairRepo;
    }

    public void addRepair(Repair repair) {
        repairRepo.save(repair);
    }

    public void editRepair(Repair repair, String message) {
        repair.setMessage(message);
    }
}
