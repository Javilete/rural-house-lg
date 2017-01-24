package com.rural.house.lg.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rural.house.lg.model.defaults.DefaultReview;

import java.sql.Timestamp;

@JsonDeserialize(as = DefaultReview.class)
public interface Review {

    public Timestamp getDate();

    public void setDate(Timestamp date);

    public String getName();

    public void setName(String name);

    public String getCity();

    public void setCity(String city);

    public String getCountry();

    public void setCountry(String country);

    public String getComment();

    public void setComment(String comment);
}
