package net.haji.ormspringdatajpa;

import net.haji.ormspringdatajpa.dao.entities.Patient;
import net.haji.ormspringdatajpa.dao.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class OrmSpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmSpringDataJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(Patient.builder().nom("Ahmad").malade(false).score(20).build());
            patientRepository.save(Patient.builder().nom("Mohammed").malade(false).score(20).build());
            patientRepository.save(Patient.builder().nom("Hamid").malade(true).score(20).build());
            patientRepository.save(Patient.builder().nom("Moustafa").malade(true).score(20).build());
            patientRepository.save(Patient.builder().nom("Yasser").malade(true).score(20).build());
            patientRepository.save(Patient.builder().nom("Omar").malade(false).score(20).build());
            patientRepository.save(Patient.builder().nom("Zakaria").malade(false).score(20).build());
            patientRepository.save(Patient.builder().nom("Mourad").malade(false).score(20).build());

            patientRepository.findAll().forEach(System.out::println);
        };
    }
}
