package desafio.geofusion.splashpage.resources;

import desafio.geofusion.splashpage.entities.Question;
import desafio.geofusion.splashpage.services.FeedbackService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

@Path("/feedback")
public class FeedbackResource
{
    private static final Logger LOGGER = LogManager.getLogger(FeedbackResource.class);
    @Autowired
    private FeedbackService feedbackService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveUserFeedback(Map<Integer, Integer> answeredQuestions)
    {
        for(Integer respostas : answeredQuestions.values())
        {
            LOGGER.info("Respostas ao feedback");
            LOGGER.info(respostas);
        }

        return Response.status(Response.Status.CREATED).entity("Obrigado pelo seu feedback").build();
    }
}
