package desafio.geofusion.splashpage.services;

import org.junit.Test;

public class EmailServiceTest
{
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNullParam()
    {
        String fromAddress = "valdemirvjr@gmail.com\"";
        String toAddress = null;
        String subject = "test mail";
        String msgBody = "test mail";

//        emailService.sendMail(toAddress, fromAddress, subject, msgBody);
    }
}
