package desafio.geofusion.splashpage.resources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/report")
public class ReportResource
{
    private static final Logger LOGGER = LogManager.getLogger(ReportResource.class);

    @GET
    public Response getUserFeedbackReport()
    {
        LOGGER.info("Log na ReportResource funfando!");

        return Response.status(Response.Status.OK).build();
    }

}
