package com.gabrielsilveira.eventos.services;

import com.gabrielsilveira.eventos.entities.Venue;
import com.gabrielsilveira.eventos.repositories.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService {
    @Autowired
    private VenueRepository venueRepository;

    public List<Venue> findAll() {
        return venueRepository.findAll();
    }
}
