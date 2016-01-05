package desafio.geofusion.splashpage.resources;

import desafio.geofusion.splashpage.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/feedback")
public class FeedbackResource
{

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveUserFeedback(List<Question> answeredQuestions)
    {

        return Response.status(Response.Status.OK).build();
    }
}
