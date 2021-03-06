package desafio.geofusion.splashpage.services;

import desafio.geofusion.splashpage.dao.UserInfoDAO;
import desafio.geofusion.splashpage.entities.UserInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService
{
    private static final Logger LOGGER = LogManager.getLogger(RegisterService.class);

    @Autowired
    private UserInfoDAO userInfoDAO;

    @Autowired
    private EmailService emailService;

    public void registerEmail(UserInfo userInfo)
    {
        // salva dados
        userInfoDAO.create(userInfo);

        // envia email com link para feedback
        emailService.sendMail(userInfo.getEmail(), "strawhatmdluffy@gmail.com", "Obrigado por se registrar",
                buildEmailMsg(userInfo));
    }

    private String buildEmailMsg(UserInfo userInfo)
    {
        String msg = String.format("Obrigado por se registrar, %s.\n link para form de feedback: s",
                userInfo.getName(), generateFeedbackFormLink(userInfo.getEmail()));

        return msg;
    }

    private String generateFeedbackFormLink(String email)
    {
        return "";
    }

    public boolean isUserAlreadyRegistered(String email)
    {
        UserInfo userInfo = userInfoDAO.findByEmail(email);

        return (userInfo != null);
    }
}
