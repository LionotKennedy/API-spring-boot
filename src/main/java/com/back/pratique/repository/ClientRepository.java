package com.back.pratique.repository;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.back.pratique.entites.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
