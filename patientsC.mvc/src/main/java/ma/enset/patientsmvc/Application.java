package ma.enset.patientsmvc;

import ma.enset.patientsmvc.entities.Patient;
import ma.enset.patientsmvc.respositories.PatientRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save
                    (new Patient(null,"hassan",new Date(),false,122));
            patientRepository.save
                    (new Patient(null,"mohammed",new Date(),true,321));
            patientRepository.save
                    (new Patient(null,"yasmine",new Date(),true,650));
            patientRepository.save
                    (new Patient(null,"hanae",new Date(),false,302));

            patientRepository.findAll().forEach((p->{
                System.out.println(p.getNom());
            }));

        };
    }

   }

