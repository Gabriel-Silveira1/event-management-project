package com.gabrielsilveira.eventos.repositories;

import com.gabrielsilveira.eventos.entities.RegistrationPK;
import com.gabrielsilveira.eventos.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, RegistrationPK> {
}
