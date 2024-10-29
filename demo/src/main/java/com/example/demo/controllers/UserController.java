package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Utilisateur;
import com.example.demo.repositories.UserRepository;

public class UserController {
    // standard constructors
    
    private final UserRepository userRepository = null;

    @GetMapping("/users")
    public List<Utilisateur> getUsers() {
        return (List<Utilisateur>)userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser (@RequestBody Utilisateur utilisateur){
        userRepository.save(utilisateur);
    }
}
