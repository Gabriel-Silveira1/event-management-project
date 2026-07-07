package com.gabrielsilveira.eventos.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_registration")
public class Registration implements Serializable {
    @EmbeddedId
    private RegistrationPK id = new RegistrationPK();

    private Instant registrationDate;
    private Integer status;

    public Registration() {
    }

    public Registration(Event event, Participant participant, Instant registrationDate, RegistrationStatus status) {
        id.setEvent(event);
        id.setParticipant(participant);
        this.registrationDate = registrationDate;
        setStatus(status);
    }

    public RegistrationPK getId() {
        return id;
    }

    public Event getEvent() {
        return id.getEvent();
    }

    public Participant getParticipant() {
        return id.getParticipant();
    }

    public void setId(RegistrationPK id) {
        this.id = id;
    }

    public Instant getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Instant registrationDate) {
        this.registrationDate = registrationDate;
    }

    public RegistrationStatus getStatus() {
        return RegistrationStatus.fromCode(status);
    }

    public void setStatus(RegistrationStatus status) {
        if (status != null) {
            this.status = status.getCode();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registration that = (Registration) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
