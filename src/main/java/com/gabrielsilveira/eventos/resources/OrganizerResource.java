package com.gabrielsilveira.eventos.resources;

import com.gabrielsilveira.eventos.entities.Organizer;
import com.gabrielsilveira.eventos.services.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/organizers")
public class OrganizerResource {

    @Autowired
    private OrganizerService organizerService;

    @GetMapping
    public ResponseEntity<List<Organizer>> findAll() {
        List<Organizer> organizers = organizerService.findAll();
        return ResponseEntity.ok().body(organizers);
    }
}