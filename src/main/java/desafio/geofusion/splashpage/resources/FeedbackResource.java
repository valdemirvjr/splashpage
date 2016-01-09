package desafio.geofusion.splashpage.resources;

import desafio.geofusion.splashpage.services.FeedbackService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Component
@Path("/feedback")
public class FeedbackResource
{
    private static final Logger LOGGER = LogManager.getLogger(FeedbackResource.class);

    @Autowired
    private FeedbackService feedbackService;

    /**
     * Formato JSON enviado pela pagina: "{"1":"1","2":"5","3":"9","4":"12"}"
     *
     * @param answeredQuestions
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveUserFeedback(Map<Integer, Integer> answeredQuestions)
    {
        Response response = Response.status(Response.Status.CREATED).entity("Obrigado pelo seu feedback").build();

        if(answeredQuestions.size() > 0)
        {
            feedbackService.saveUserFeedback(answeredQuestions);
        }
        else
        {
            LOGGER.error("JSON com as perguntas de feedback nao recebido." + answeredQuestions);

            response = Response.status(Response.Status.BAD_REQUEST).entity("feedback nao recebido").build();
        }

        return response;
    }
}
