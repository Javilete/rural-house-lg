package com.rural.house.lg.resource;

import com.rural.house.lg.annotations.Documentation;
import com.rural.house.lg.model.interfaces.BookingConfirmation;
import com.rural.house.lg.model.interfaces.BookingEnquiry;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api/booking")
@Documentation("BookingEnquiry API")
public abstract class BookingResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/check")
    public Response checkReservation(BookingEnquiry bookingEnquiry) {
        return checkReservationImpl(bookingEnquiry);
    }

    public abstract Response checkReservationImpl(BookingEnquiry bookingEnquiry);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/submit")
    public Response submitReservation(List<BookingConfirmation> bookingConfirmation) {
        return submitReservationImpl(bookingConfirmation);
    }

    public abstract Response submitReservationImpl(List<BookingConfirmation> bookingConfirmation);
}
