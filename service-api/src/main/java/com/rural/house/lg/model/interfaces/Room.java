package com.rural.house.lg.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rural.house.lg.model.Floor;
import com.rural.house.lg.model.RoomType;
import com.rural.house.lg.model.defaults.DefaultRoom;

@JsonDeserialize(as = DefaultRoom.class)
public interface Room {

    public RoomType getType();

    public void setType(RoomType type);

    public Floor getFloor();

    public void setFloor(Floor floor);
}
