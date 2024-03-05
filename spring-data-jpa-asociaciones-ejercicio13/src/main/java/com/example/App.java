package com.example;

import com.example.model.Circuits;
import com.example.model.Constructors;
import com.example.model.Drivers;
import com.example.model.Races;
import com.example.repository.CircuitsRepository;
import com.example.repository.ConstructorsRepository;
import com.example.repository.DriversRepository;
import com.example.repository.RacesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        var circuitsRepository = context.getBean(CircuitsRepository.class);
        var driversRepository = context.getBean(DriversRepository.class);
        var racesRepository = context.getBean(RacesRepository.class);
        var constructorsRepository = context.getBean(ConstructorsRepository.class);

        Circuits circuit = new Circuits(null,"micircuito","deespana","Spain","valencia",45.4,3.16361,5,"https://circuitovalencia", (Races) racesRepository.findAllById(Collections.singleton(53)));
        circuitsRepository.save(circuit);

        Constructors constructor = new Constructors(null,"ferrari","Ferrari","Italian","https://ferrari.com",driversRepository.);
        constructorsRepository.save(constructor);

        Races race = new Races(null,2006,54,1,"best race",null, LocalTime.now(),"https://thebestrace",driversRepository.findAll(), (Circuits) circuitsRepository.findAllById(Collections.singleton(4)));
        racesRepository.save(race);

        Drivers driver = new Drivers(null,"empleado","20","Spanish","No hay", "AAH",5,null,Collections.singletonList(constructorsRepository.getById(1)), Collections.singletonList(racesRepository.getById(53)));
        driversRepository.save(driver);

    }

}
