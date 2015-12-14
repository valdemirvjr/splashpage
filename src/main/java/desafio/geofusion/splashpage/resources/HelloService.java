package desafio.geofusion.splashpage.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService
{
    @GET
    @Path("/{name}")
    public Response getResponse(@PathParam("name") String name)
    {
        String responseString = "Hello, " + name;

        return Response.status(Response.Status.OK).entity(responseString).build();
    }

}
