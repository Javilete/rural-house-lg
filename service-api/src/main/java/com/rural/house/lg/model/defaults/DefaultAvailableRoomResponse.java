package com.rural.house.lg.model.defaults;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rural.house.lg.model.interfaces.Availability;
import com.rural.house.lg.model.interfaces.AvailableRoomResponse;
import com.rural.house.lg.model.interfaces.Room;

import java.util.List;

public class DefaultAvailableRoomResponse implements AvailableRoomResponse {

    @JsonProperty
    private Room room;

    @JsonProperty
    private List<Availability> availability;

    public DefaultAvailableRoomResponse() {

    }

    public DefaultAvailableRoomResponse(Room room, List<Availability> availability){
        this.room = room;
        this.availability = availability;
    }

    @Override
    public Room getRoom() {
        return this.room;
    }

    @Override
    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public List<Availability> getAvailability() {
        return this.availability;
    }

    @Override
    public void setAvailability(List<Availability> roomAvailabilities) {
        this.availability = roomAvailabilities;
    }


}
