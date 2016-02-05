package backend;

import javax.ws.rs.*;

public interface BackendInterface {

    @GET
    @Path("/basic")
    @Produces("application/json")
    String getBasic();

    @PUT
    @Path("/basic")
    @Consumes("application/json")
    void putBasic(String body);

    @POST
    @Path("/basic")
    @Consumes("application/json")
    String postBasic(String body);
}
