package com.example.workshopCRM.repository;

import com.example.workshopCRM.model.Car;
import com.example.workshopCRM.model.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepairRepo extends JpaRepository<Repair, Long> {

    List<Repair> findAllByCar(Car car);
}
