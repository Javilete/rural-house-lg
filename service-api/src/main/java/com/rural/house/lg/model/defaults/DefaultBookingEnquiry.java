package com.rural.house.lg.model.defaults;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rural.house.lg.model.interfaces.BookingEnquiry;

import java.sql.Timestamp;

public class DefaultBookingEnquiry implements BookingEnquiry {

    @JsonProperty
    private Timestamp arrivingDate;

    @JsonProperty
    private Integer guests;

    @JsonProperty
    private Timestamp departingDate;

    public DefaultBookingEnquiry(){

    }

    public DefaultBookingEnquiry(Timestamp arrivingDate, Integer guests, Timestamp departingDate){
        this.arrivingDate = arrivingDate;
        this.guests = guests;
        this.departingDate = departingDate;
    }

    @Override
    public Timestamp getArrivingDate() {
        return this.arrivingDate;
    }

    @Override
    public void setArrivingDate(Timestamp arrivingDate) {
        this.arrivingDate = arrivingDate;
    }

    @Override
    public Integer getGuests() {
        return this.guests;
    }

    @Override
    public void setGuests(Integer guests) {
        this.guests = guests;
    }

    @Override
    public Timestamp getDepartingDate() {
        return this.departingDate;
    }

    @Override
    public void setDepartingDate(Timestamp departingDate) {
        this.departingDate = departingDate;
    }
}
