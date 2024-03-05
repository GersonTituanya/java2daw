package com.example.spring_ejercicio12;

import com.example.spring_ejercicio12.model.Driver;
import com.example.spring_ejercicio12.repository.DriverRepository;
import com.example.spring_ejercicio12.service.DriverService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringEjercicio12Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringEjercicio12Application.class, args);

    }

}
