package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Utilisateur;
import com.example.demo.repositories.UserRepository;



@SpringBootApplication
public class WebAppSpringBootAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppSpringBootAngularApplication.class, args);
	}

	@Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                Utilisateur utilisateur = new Utilisateur(name, name.toLowerCase() + "@domain.com");
                userRepository.save(utilisateur);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }

}
