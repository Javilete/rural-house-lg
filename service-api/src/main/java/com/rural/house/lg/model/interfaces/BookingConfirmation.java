package com.rural.house.lg.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rural.house.lg.model.RoomType;
import com.rural.house.lg.model.defaults.DefaultBookingConfirmation;

import java.sql.Timestamp;

@JsonDeserialize(as = DefaultBookingConfirmation.class)
public interface BookingConfirmation {

    public Timestamp getDate();

    public void setDate(Timestamp date);

    public Integer getGuests();

    public void setGuests(Integer guests);

    public RoomType getRoomType();

    public void setRoomType(RoomType roomType);
}
