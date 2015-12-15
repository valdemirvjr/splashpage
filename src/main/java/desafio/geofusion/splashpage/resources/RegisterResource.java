package desafio.geofusion.splashpage.resources;

import desafio.geofusion.splashpage.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Component
@Path("/register")
public class RegisterResource
{
    @Autowired
    private RegisterService registerService;

    @POST
    @Consumes({"application/json"})
    public Response registerUserEmail()
    {
        return Response.status(Response.Status.OK).build();
    }
}
