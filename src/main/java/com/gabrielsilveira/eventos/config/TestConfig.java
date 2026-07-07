package com.gabrielsilveira.eventos.config;

import com.gabrielsilveira.eventos.entities.*;
import com.gabrielsilveira.eventos.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
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

    @Autowired
    EventRepository eventRepository;

    @Autowired
    RegistrationRepository registrationRepository;

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

        Event e1 = new Event(null, "Java Summit 2024", "Maior evento Java do Brasil", Instant.parse("2024-05-10T09:00:00Z"), 150.00, EventStatus.PUBLISHED, org1, cat1, v1);
        Event e2 = new Event(null, "Rock in Rio Edição SP", "Festival de música", Instant.parse("2024-06-15T18:00:00Z"), 300.00, EventStatus.DRAFT, org2, cat2, v2);
        Event e3 = new Event(null, "Maratona Urbana SP", "Corrida de rua 10km", Instant.parse("2024-07-20T07:00:00Z"), 80.00, EventStatus.PUBLISHED, org1, cat3, v1);
        eventRepository.saveAll(Arrays.asList(e1, e2, e3));

        Registration r1 = new Registration(e1, par1, Instant.now(), RegistrationStatus.CONFIRMED);
        Registration r2 = new Registration(e2, par1, Instant.now(), RegistrationStatus.PENDING);
        Registration r3 = new Registration(e1, par2, Instant.now(), RegistrationStatus.CONFIRMED);
        registrationRepository.saveAll(Arrays.asList(r1, r2, r3));
    }
}
