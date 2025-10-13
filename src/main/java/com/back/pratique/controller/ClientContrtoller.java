package com.back.pratique.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.back.pratique.entites.Client;

import org.springframework.http.HttpStatus;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping(path = "client")
public class ClientContrtoller {
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void creer(Client client) {
// http://localhost:9090/api/client
// {
//     "email":"lionot@gmail.com"
// }
    }

}
