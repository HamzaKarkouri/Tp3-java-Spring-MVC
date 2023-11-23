package com.example.patientsmvc;

import com.example.patientsmvc.Entities.Patient;
import com.example.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }
    @Bean
CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return  args -> {
            patientRepository.save(new Patient(null,"hassan",new Date(),false,56));
            patientRepository.save(new Patient(null,"Hamza",new Date(),true,100));
            patientRepository.save(new Patient(null,"Oussama",new Date(),false,210));
           patientRepository.findAll().forEach(p->{
               System.out.println(p.getNom());
           });
        };
}
}
