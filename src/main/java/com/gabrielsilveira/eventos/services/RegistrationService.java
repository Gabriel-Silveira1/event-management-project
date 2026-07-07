package com.gabrielsilveira.eventos.services;

import com.gabrielsilveira.eventos.repositories.RegistrationRepository;
import com.gabrielsilveira.eventos.entities.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }
}
