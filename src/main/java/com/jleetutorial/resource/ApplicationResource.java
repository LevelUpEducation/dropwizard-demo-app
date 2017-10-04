package com.jleetutorial.resource;

import com.jleetutorial.response.DateResponse;
import com.jleetutorial.response.PongResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class ApplicationResource {

    @GET
    @Path("/date")
    public DateResponse getDate() {
        return new DateResponse(new Date());
    }

    @GET
    @Path("/pong")
    public PongResponse getPong() {
        return new PongResponse("pong");
    }
}
