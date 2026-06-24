package com.gabrielsilveira.eventos.repositories;

import com.gabrielsilveira.eventos.entities.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
    
}
