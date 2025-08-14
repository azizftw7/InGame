package com.example.ingame.model;

import java.time.LocalDate;

public class Event {
    private int EventId;
    private String Name;
    private LocalDate date;

    public Event(int EventId, String name, LocalDate date) {
        EventId = EventId;
        Name = name;
        this.date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getEventId() {
        return EventId;
    }

    public void setEventId(int EventId) {
        EventId = EventId;
    }
}
