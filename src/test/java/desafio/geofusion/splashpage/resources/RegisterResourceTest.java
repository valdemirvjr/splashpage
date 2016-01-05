package desafio.geofusion.splashpage.resources;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Application;

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
}
