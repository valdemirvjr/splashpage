package desafio.geofusion.splashpage.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/register")
public class RegisterService
{
    @POST
    public Response registerEmail()
    {
        return Response.status(Response.Status.OK).build();
    }
}
