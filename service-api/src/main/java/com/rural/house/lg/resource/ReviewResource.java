package com.rural.house.lg.resource;

import com.rural.house.lg.annotations.Documentation;
import com.rural.house.lg.model.interfaces.Review;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/review")
@Documentation("Review API")
public abstract class ReviewResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addReview(Review review) {
        return addReviewImpl(review);
    }

    public abstract Response addReviewImpl(Review review);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getReviewList() {
        return getReviewListImpl();
    }

    public abstract Response getReviewListImpl();
}
