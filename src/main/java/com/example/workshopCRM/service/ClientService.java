package com.example.workshopCRM.service;

import com.example.workshopCRM.model.Client;
import com.example.workshopCRM.repository.ClientRepo;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepo clientRepo;

    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public void addClient(Client client) {
        clientRepo.save(client);
    }
}
