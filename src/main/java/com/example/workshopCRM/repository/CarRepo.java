package com.example.workshopCRM.repository;

import com.example.workshopCRM.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CarRepo extends JpaRepository<Car, UUID> {
    Optional<Car> findByUuid(UUID uuid);

    Optional<Car> findByLicensePlates(String licencePlates);

    Optional<Car> findByVIN(String VIN);
}
