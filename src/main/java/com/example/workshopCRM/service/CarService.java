package com.example.workshopCRM.service;

import com.example.workshopCRM.model.Car;
import com.example.workshopCRM.repository.CarRepo;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CarService {

    private CarRepo carRepo;

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public void addCar(Car car) {
        carRepo.save(car);
    }
    public Car findByUuid(UUID uuid) {
        return carRepo.findByUuid(uuid).get();
    }
    public Car findByLicensePlates(String licencePlates) {
        return carRepo.findByLicensePlates(licencePlates).get();
    }
    public Car findByVIN(String VIN) {
        return carRepo.findByVIN(VIN).get();
    }
}
