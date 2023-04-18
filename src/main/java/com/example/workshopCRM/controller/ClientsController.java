package com.example.workshopCRM.controller;


import com.example.workshopCRM.model.Client;
import com.example.workshopCRM.repository.ClientRepo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientsController {

    private ClientRepo clientRepo;

    public ClientsController(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @GetMapping("/addclient")
    public String addClient() {

        return "/newclient";
    }

    @GetMapping("/allclients")
    public String allClients(Model model) {
        List<Client> allclients = clientRepo.findAll();
        model.addAttribute("allclients", allclients);
        return "/allclients";
    }
}
