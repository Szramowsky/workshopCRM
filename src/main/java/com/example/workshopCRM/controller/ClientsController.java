package com.example.workshopCRM.controller;


import com.example.workshopCRM.model.Client;
import com.example.workshopCRM.repository.ClientRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClientsController {

    private ClientRepo clientRepo;

    public ClientsController(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @GetMapping("/addclient")
    public String addClient(Model model) {
        model.addAttribute("client", new Client());
        return "clientForm";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Client client) {
        clientRepo.save(client);
        return "wynik";
    }

    @GetMapping("/allclients")
    public String allClients(Model model) {
        List<Client> allclients = clientRepo.findAll();
        model.addAttribute("allclients", allclients);
        return "/allclients";
    }
}
