package com.rural.house.lg.model.defaults;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.rural.house.lg.model.interfaces.Availability;

import java.sql.Timestamp;

public class DefaultAvailability implements Availability {

    @JsonProperty
    private Timestamp date;

    @JsonProperty
    private Integer guests;

    public DefaultAvailability() {}

    public DefaultAvailability(Timestamp date, Integer guests) {
        this.date = date;
        this.guests = guests;
    }

    @Override
    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public Timestamp getDate() {
        return this.date;
    }

    @Override
    public void setGuests(Integer guests) {
        this.guests = guests;
    }

    @Override
    public Integer getGuests() {
        return this.guests;
    }
}
