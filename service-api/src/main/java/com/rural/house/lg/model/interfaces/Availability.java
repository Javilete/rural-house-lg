package com.rural.house.lg.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rural.house.lg.model.defaults.DefaultAvailability;

import java.sql.Timestamp;

@JsonDeserialize(as = DefaultAvailability.class)
public interface Availability {

    public void setDate(Timestamp date);

    public Timestamp getDate();

    public void setGuests(Integer guests);

    public Integer getGuests();

}
