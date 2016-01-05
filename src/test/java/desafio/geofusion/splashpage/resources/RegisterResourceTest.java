package desafio.geofusion.splashpage.resources;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

public class RegisterResourceTest extends JerseyTest
{
    @Override
    protected Application configure()
    {
        return new ResourceConfig(RegisterResource.class);
    }

    @Test
    public void test()
    {
        final String hello = target("register").request().get(String.class);

        Assert.assertEquals("Hello World", hello);
    }

    @Test
    public void shouldReceiveBadRequestForUserInfoNull()
    {
        final Response response = target("register").request().post(null);

        Assert.assertEquals(Response.Status.BAD_REQUEST.getStatusCode() , response.getStatus());
    }

    @Test
    public void shouldReceiveBadRequestForEmptyJson()
    {

    }

    @Test
    public void shouldReceiveCreatedForNewUserRegister()
    {

    }

    @Test
    public void shoulReceiveNotModifiedForExistenteUser()
    {

    }
}
