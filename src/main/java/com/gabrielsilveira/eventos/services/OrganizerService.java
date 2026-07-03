package com.gabrielsilveira.eventos.services;

import com.gabrielsilveira.eventos.entities.Organizer;
import com.gabrielsilveira.eventos.repositories.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerService {

    @Autowired
    private OrganizerRepository organizerRepository;

    public List<Organizer> findAll() {
        return organizerRepository.findAll();
    }
}