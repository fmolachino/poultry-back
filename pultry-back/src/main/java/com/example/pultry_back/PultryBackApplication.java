package com.example.pultry_back;

import java.util.NoSuchElementException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.pultry_back.entity.User;
import com.example.pultry_back.repository.UserRepository;

@SpringBootApplication
public class PultryBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PultryBackApplication.class, args);
	}
  
}
