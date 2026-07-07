package com.gabrielsilveira.eventos.resources;

import com.gabrielsilveira.eventos.services.RegistrationService;
import com.gabrielsilveira.eventos.entities.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/registrations")
public class RegistrationResource {
    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public ResponseEntity<List<Registration>> findAll() {
        List<Registration> registrations = registrationService.findAll();
        return ResponseEntity.ok().body(registrations);
    }
}
