package desafio.geofusion.splashpage.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class EmailServiceTest
{
    @Autowired
    private EmailService emailService;

    /**
     * Esse teste tem uma parte manual que eh checar a propria caixa de email.
     */
    @Test
    public void shouldSendMailToMe()
    {
        String fromAddress = "valdemirvjr@gmail.com\"";
        String toAddress = "valdemirvjr@gmail.com\"";
        String subject = "test mail";
        String msgBody = "test mail";

        emailService.sendMail(toAddress, fromAddress, subject, msgBody);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNullParam()
    {
        String fromAddress = "valdemirvjr@gmail.com\"";
        String toAddress = null;
        String subject = "test mail";
        String msgBody = "test mail";

        emailService.sendMail(toAddress, fromAddress, subject, msgBody);
    }

}
