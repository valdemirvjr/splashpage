package desafio.geofusion.splashpage.integration;

import desafio.geofusion.splashpage.services.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
public class EmailServiceIntegrationTest
{
    @Autowired
    private EmailService emailService;

    /**
     * Esse teste tem uma parte manual que eh checar a propria caixa de email.
     */
    @Test
    public void shouldSendMailToMe()
    {
        String fromAddress = "valdemirvjr@gmail.com";
        String toAddress = "valdemirvjr@gmail.com";
        String subject = "test mail";
        String msgBody = "test mail";

        emailService.sendMail(toAddress, fromAddress, subject, msgBody);
    }

}
