package com.rural.house.lg.model.defaults;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rural.house.lg.model.interfaces.Review;

import java.sql.Timestamp;

public class DefaultReview implements Review {

    @JsonProperty
    Timestamp date;

    @JsonProperty
    String name;

    @JsonProperty
    String city;

    @JsonProperty
    String country;

    @JsonProperty
    String comment;

    @Override
    public Timestamp getDate() {
        return this.date;
    }

    @Override
    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getComment() {
        return this.comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }
}
