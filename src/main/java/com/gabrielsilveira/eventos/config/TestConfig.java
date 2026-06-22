package com.gabrielsilveira.eventos.config;

import com.gabrielsilveira.eventos.entities.Participant;
import com.gabrielsilveira.eventos.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    ParticipantRepository participantRepository;

    @Override
    public void run(String... args) throws Exception {
        Participant par1 = new Participant(null, "Lucas Ferreira", "lucas@gmail.com", "11988880001", "CPF-111.222.333-44");
        Participant par2 = new Participant(null, "Camila Rocha", "camila@gmail.com", "11988880002", "CPF-555.666.777-88");
        participantRepository.saveAll(Arrays.asList(par1, par2));
    }
}
