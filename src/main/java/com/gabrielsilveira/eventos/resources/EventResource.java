package com.gabrielsilveira.eventos.resources;

import com.gabrielsilveira.eventos.entities.Event;
import com.gabrielsilveira.eventos.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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
