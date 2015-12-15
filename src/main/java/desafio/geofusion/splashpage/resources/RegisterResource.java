package desafio.geofusion.splashpage.resources;

import desafio.geofusion.splashpage.entities.UserInfo;
import desafio.geofusion.splashpage.services.RegisterService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("/register")
public class RegisterResource
{
    private static final Logger LOGGER = LogManager.getLogger(RegisterResource.class);

    @Autowired
    private RegisterService registerService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registerUserEmail(UserInfo userInfo)
    {
        Response response = Response.status(Response.Status.OK).entity("it works").build();

        if(userInfo == null)
        {
            response = Response.status(Response.Status.BAD_REQUEST).entity("dados nao enviados").build();
        }
        else
        {
            LOGGER.info("Dados recebidos: " + userInfo);
        }

        return response;
    }
}
