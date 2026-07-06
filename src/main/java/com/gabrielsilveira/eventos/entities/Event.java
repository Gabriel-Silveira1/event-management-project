package com.gabrielsilveira.eventos.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_event")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Instant dateTime;
    private Double price;
    private Integer status;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "organizer_id")
    private Organizer organizer;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "venue_id")
    private Venue venue;

    @JsonIgnore
    @OneToMany(mappedBy = "event")
    private List<Registration> registrations = new ArrayList<>();

    public Event() {

    }

    public Event(Long id, String title, String description, Instant dateTime, Double price, EventStatus status, Organizer organizer, Category category, Venue venue) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.price = price;
        setStatus(status);
        this.organizer = organizer;
        this.category = category;
        this.venue = venue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public EventStatus getStatus() {
        return EventStatus.valueOf(status);
    }

    public void setStatus(EventStatus status) {
        if (status == null) {
            this.status = status.getCode();
        }
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
