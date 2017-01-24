package com.rural.house.lg.model.defaults;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rural.house.lg.model.RoomType;
import com.rural.house.lg.model.interfaces.BookingConfirmation;

import java.sql.Timestamp;

public class DefaultBookingConfirmation implements BookingConfirmation {

    @JsonProperty
    private Timestamp date;

    @JsonProperty
    private Integer guests;

    @JsonProperty
    private RoomType roomType;


    public DefaultBookingConfirmation() {

    }

    public DefaultBookingConfirmation(Timestamp date, Integer guests, RoomType roomType) {
        this.date = date;
        this.guests = guests;
        this.roomType = roomType;
    }

    @Override
    public Timestamp getDate() {
        return this.date;
    }

    @Override
    public void setDate(Timestamp date) {
        this.date = date;
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
    public RoomType getRoomType() {
        return this.roomType;
    }

    @Override
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
}
