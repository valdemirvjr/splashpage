package desafio.geofusion.splashpage.integration;

import desafio.geofusion.splashpage.dao.UserInfoDAO;
import desafio.geofusion.splashpage.entities.UserInfo;
import desafio.geofusion.splashpage.services.EmailService;
import desafio.geofusion.splashpage.services.RegisterService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class RegisterServiceTest
{
    @Mock
    private UserInfoDAO userInfoDAO;

    @Mock
    private EmailService emailService;

    @InjectMocks
    @Autowired
    private RegisterService registerService;

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldRegisterUserEmailAndSendFeedbackLink()
    {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("Luffy");
        userInfo.setEmail("strawhatmdluffy@gmail.com");

        registerService.registerEmail(userInfo);


    }

}
