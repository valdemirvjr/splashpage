package desafio.geofusion.splashpage.services;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
public class EmailServiceTest
{
    @Mock
    private JavaMailSender mailSender;

    @InjectMocks
    @Autowired
    private EmailService emailService;

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNullParam()
    {
        String fromAddress = "valdemirvjr@gmail.com";
        String toAddress = null;
        String subject = "test mail";
        String msgBody = "test mail";

        emailService.sendMail(toAddress, fromAddress, subject, msgBody);
    }

    @Test
    public void shouldSendMail()
    {
        doNothing().when(mailSender).send(any(SimpleMailMessage.class));

        String fromAddress = "valdemirvjr@gmail.com";
        String toAddress = "valdemirvjr@gmail.com";
        String subject = "test mail";
        String msgBody = "test mail";

        emailService.sendMail(toAddress, fromAddress, subject, msgBody);
    }
}
