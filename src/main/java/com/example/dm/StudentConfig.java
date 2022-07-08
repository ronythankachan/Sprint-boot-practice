package com.example.dm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student rony = new Student("Rony", LocalDate.of(1992, Month.JANUARY, 2));
            Student alex = new Student("Alex", LocalDate.of(1997, Month.NOVEMBER, 11));
            studentRepository.saveAll(List.of(rony, alex));
        };
    }
}
