package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student madushan = new Student(
                    "Madushan",
                    LocalDate.of(2000, 6, 5),
                    "Madushan@gmail.com"
            );

            Student alex = new Student(
                    "Alex",
                    LocalDate.of(2010,7, 15),
                    "Madushan@gmail.com"
            );

            repository.saveAll(
                    List.of(madushan, alex)
            );
        };
    }
}
