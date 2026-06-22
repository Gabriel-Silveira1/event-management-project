package com.gabrielsilveira.eventos.services;

import com.gabrielsilveira.eventos.entities.Participant;
import com.gabrielsilveira.eventos.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {
    @Autowired
    ParticipantRepository participantRepository;

    public List<Participant> findAll() {
        return participantRepository.findAll();
    }
}
