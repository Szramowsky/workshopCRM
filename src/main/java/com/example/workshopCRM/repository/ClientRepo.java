package com.example.workshopCRM.repository;

import com.example.workshopCRM.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepo extends JpaRepository<Client, String> {

    Optional<Client> findByName(String name);
}
