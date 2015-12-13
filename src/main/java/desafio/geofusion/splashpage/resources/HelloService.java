package desafio.geofusion.splashpage.resources;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Component
@Path("/hello")
public class HelloService
{
    @GET
    @Path("/{name}")
    public Response getResponse(@PathParam("name") String name)
    {
        String response = "Hello, " + name;

        return Response.status(Response.Status.OK).build();
    }

}
