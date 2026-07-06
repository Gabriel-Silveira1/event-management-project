package com.gabrielsilveira.eventos.services;

import com.gabrielsilveira.eventos.entities.Event;
import com.gabrielsilveira.eventos.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
