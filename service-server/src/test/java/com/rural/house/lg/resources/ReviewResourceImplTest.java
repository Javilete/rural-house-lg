package com.rural.house.lg.resources;

import com.rural.house.lg.service.ReviewService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;
import static javax.ws.rs.core.Response.Status.OK;

public class ReviewResourceImplTest {

    @Mock
    private ReviewService reviewService;

    @InjectMocks
    private ReviewResourceImpl reviewResource;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void shouldCallServicerToRetrieveListOfReviews() throws Exception {
        Response response = reviewResource.getReviewList();
        verify(reviewService).getReviews();
        assertEquals(OK.getStatusCode(), response.getStatus());

    }
}
