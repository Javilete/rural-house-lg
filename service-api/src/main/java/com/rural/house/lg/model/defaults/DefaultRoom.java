package com.rural.house.lg.model.defaults;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.rural.house.lg.model.Floor;
import com.rural.house.lg.model.RoomType;
import com.rural.house.lg.model.interfaces.Room;

public class DefaultRoom implements Room{

    @JsonProperty
    private RoomType type;

    @JsonProperty
    private Floor floor;

    public DefaultRoom(){}

    public DefaultRoom(RoomType type, Floor floor) {
        this.type = type;
        this.floor = floor;
    }

    @Override
    public RoomType getType() {
        return this.type;
    }

    @Override
    public void setType(RoomType type) {
        this.type = type;
    }

    @Override
    public Floor getFloor() {
        return this.floor;
    }

    @Override
    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefaultRoom that = (DefaultRoom) o;

        if (floor != that.floor) return false;
        if (type != that.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + floor.hashCode();
        return result;
    }
}
