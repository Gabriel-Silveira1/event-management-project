package com.gabrielsilveira.eventos.repositories;

import com.gabrielsilveira.eventos.entities.RegistrationPK;
import jakarta.servlet.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, RegistrationPK> {
}
