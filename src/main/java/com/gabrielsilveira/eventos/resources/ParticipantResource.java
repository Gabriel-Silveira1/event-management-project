package com.gabrielsilveira.eventos.resources;

import com.gabrielsilveira.eventos.entities.Participant;
import com.gabrielsilveira.eventos.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/participants")
public class ParticipantResource {
    @Autowired
    private ParticipantService participantService;

    @GetMapping
    public ResponseEntity<List<Participant>> findAll() {
        List<Participant> participants = participantService.findAll();
        return ResponseEntity.ok().body(participants);
    }
}
