package com.gabrielsilveira.eventos.resources;

import com.gabrielsilveira.eventos.entities.Venue;
import com.gabrielsilveira.eventos.repositories.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/venues")
public class VenueResource {
    @Autowired
    private VenueRepository venueRepository;

    @GetMapping
    public ResponseEntity<List<Venue>> findAll() {
        List<Venue> venues = venueRepository.findAll();
        return ResponseEntity.ok().body(venues);
    }
}
