package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entities.Utilisateur;

public interface UserRepository extends CrudRepository<Utilisateur, Long>{
    
}
