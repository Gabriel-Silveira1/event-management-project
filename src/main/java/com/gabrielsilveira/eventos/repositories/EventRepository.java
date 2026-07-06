package com.gabrielsilveira.eventos.repositories;

import com.gabrielsilveira.eventos.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
