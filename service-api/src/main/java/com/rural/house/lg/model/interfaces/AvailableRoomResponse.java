package com.rural.house.lg.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rural.house.lg.model.defaults.DefaultAvailableRoomResponse;

import java.util.List;

@JsonDeserialize(as = DefaultAvailableRoomResponse.class)
public interface AvailableRoomResponse {

    public Room getRoom();

    public void setRoom(Room room);

    public List<Availability> getAvailability();

    public void setAvailability(List<Availability> roomAvailabilities);
}
