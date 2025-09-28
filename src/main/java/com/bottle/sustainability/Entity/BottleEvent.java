package com.bottle.sustainability.Entity;

import com.bottle.sustainability.Repository.EventType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class BottleEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "event_type")
    private EventType eventType;

    @Column(name = "event_creation_date")
    private LocalDateTime eventCreationDate;

    @ManyToOne
    @JoinColumn(name="bottle_id")
    private Bottle bottle;

    protected BottleEvent() {}

    public BottleEvent( LocalDateTime eventCreationDate) {
        this.eventCreationDate = eventCreationDate;
    }

    public Long getId() {
        return id;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getEventCreationDate() {
        return eventCreationDate;
    }

    public void setEventCreationDate(LocalDateTime eventCreationDate) {
        this.eventCreationDate = eventCreationDate;
    }

    @Override
    public String toString() {
        return "BottleEvent{" +
                "id=" + id +
                ", eventType='" + eventType + '\'' +
                ", eventCreationDate=" + eventCreationDate +
                '}';
    }
}
