package com.gabrielsilveira.eventos.config;

import com.gabrielsilveira.eventos.entities.Category;
import com.gabrielsilveira.eventos.entities.Organizer;
import com.gabrielsilveira.eventos.entities.Participant;
import com.gabrielsilveira.eventos.entities.Venue;
import com.gabrielsilveira.eventos.repositories.CategoryRepository;
import com.gabrielsilveira.eventos.repositories.OrganizerRepository;
import com.gabrielsilveira.eventos.repositories.ParticipantRepository;
import com.gabrielsilveira.eventos.repositories.VenueRepository;
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

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    VenueRepository venueRepository;

    @Autowired
    OrganizerRepository organizerRepository;

    @Override
    public void run(String... args) throws Exception {
        Participant par1 = new Participant(null, "Lucas Ferreira", "lucas@gmail.com", "11988880001", "CPF-111.222.333-44");
        Participant par2 = new Participant(null, "Camila Rocha", "camila@gmail.com", "11988880002", "CPF-555.666.777-88");
        participantRepository.saveAll(Arrays.asList(par1, par2));

        Category cat1 = new Category(null, "Technology");
        Category cat2 = new Category(null, "Music");
        Category cat3 = new Category(null, "Sports");
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        Venue v1 = new Venue(null, "Centro de Convenções SP", "Av. Paulista, 1000", 500);
        Venue v2 = new Venue(null, "Arena Rio", "Rua das Laranjeiras, 200", 2000);
        venueRepository.saveAll(Arrays.asList(v1, v2));

        Organizer org1 = new Organizer(null, "Tech Events Ltda", "contato@techevents.com", "11999990001", "Eventos tech");
        Organizer org2 = new Organizer(null, "Cultura & Arte", "contato@culturaarte.com", "21999990002", "Eventos culturais");
        organizerRepository.saveAll(Arrays.asList(org1, org2));
    }
}
