package desafio.geofusion.splashpage.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/report")
public class ReportService
{
    @GET
    public Response getUserFeedbackReport()
    {

        return Response.status(Response.Status.OK).build();
    }

}
