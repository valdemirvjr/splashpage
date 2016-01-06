package desafio.geofusion.splashpage.resources;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.SpringWebApplicationInitializer;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RegisterResourceTest extends JerseyTest
{
    private final String urlRoot = "register";

    @Override
    protected Application configure()
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");

        return new ResourceConfig(RegisterResource.class);
    }

    @Test
    public void shouldReceiveBadRequestForUserInfoNull()
    {
        final Response response = target(urlRoot).request().post(null);

        Assert.assertEquals(Response.Status.BAD_REQUEST.getStatusCode() , response.getStatus());
    }

//    @Test
//    public void shouldReceiveBadRequestForEmptyJson()
//    {
//        final Response response = target(urlRoot).request().post(Entity.entity("{}", MediaType.APPLICATION_JSON));
//
//        Assert.assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), response.getStatus());
//    }

    @Test
    public void shouldReceiveCreatedForNewUserRegister()
    {
        final Response response = target(urlRoot).request().post(Entity.entity(
                "{\"email\":\"valdemirvjr@gmail.com\",\"name\":\"Valdemir\"}", MediaType.APPLICATION_JSON));

        Assert.assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
    }

    @Test
    public void shouldReceiveNotModifiedForExistenteUser()
    {
        // no primeiro registro eh esperado 201
        final Response response1 = target(urlRoot).request().post(Entity.entity(
                "{\"email\":\"valdemirvjr@gmail.com\",\"name\":\"Valdemir\"}", MediaType.APPLICATION_JSON));
        Assert.assertEquals(Response.Status.CREATED.getStatusCode(), response1.getStatus());

        // na tentativa de registrar novamente o msm email eh esperado 304
        final Response response2 = target(urlRoot).request().post(Entity.entity(
                "{\"email\":\"valdemirvjr@gmail.com\",\"name\":\"Valdemir\"}", MediaType.APPLICATION_JSON));
        Assert.assertEquals(Response.Status.NOT_MODIFIED.getStatusCode(), response2.getStatus());
    }
}
