package com.gabrielsilveira.eventos.resources;

import com.gabrielsilveira.eventos.entities.Event;
import com.gabrielsilveira.eventos.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/events")
public class EventResource {
    @Autowired
    private EventService eventService;

    @GetMapping
    public ResponseEntity<List<Event>> findAll() {
        List<Event> events = eventService.findAll();
        return ResponseEntity.ok().body(events);
    }
}
