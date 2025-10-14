package com.back.pratique.service;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back.pratique.entites.Client;
import com.back.pratique.repository.ClientRepository;

@Service
public class ClientService {
    // @Autowired
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void creer(Client client) {
        this.clientRepository.save(client);
    }

    public List<Client> recherche() {
        return this.clientRepository.findAll();
    }
}
