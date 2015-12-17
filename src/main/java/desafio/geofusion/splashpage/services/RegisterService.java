package desafio.geofusion.splashpage.services;

import desafio.geofusion.splashpage.dao.UserInfoDAO;
import desafio.geofusion.splashpage.entities.UserInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
        emailService.sendMail(userInfo.getEmail(), "valdemirvjr@gmail.com", "Obrigado por se registrar", buildEmailMsg(userInfo.getName()));
    }

    private String buildEmailMsg(String name)
    {
        String msg = "Obrigado por se registrar, " + name + ".\n link para form de feedback";

        return msg;
    }
}
