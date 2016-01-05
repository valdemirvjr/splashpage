package desafio.geofusion.splashpage.resources;

import desafio.geofusion.splashpage.entities.UserInfo;
import desafio.geofusion.splashpage.services.RegisterService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
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
        Response response = Response.status(Response.Status.OK).entity("Registro efetuado com sucesso").build();

        if(userInfo != null)
        {
            LOGGER.info("Dados recebidos e convertidos: " + userInfo);

            registerService.registerEmail(userInfo);
        }
        else
        {
            LOGGER.error("Dados recebidos invalidos: " + userInfo);

            response = Response.status(Response.Status.BAD_REQUEST).entity("dados invalidos").build();
        }

        return response;
    }

    @GET
    public String getHello()
    {
        return "Hello World";
    }
}
