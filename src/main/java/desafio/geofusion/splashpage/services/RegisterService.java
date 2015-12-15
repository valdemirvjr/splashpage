package desafio.geofusion.splashpage.services;

import desafio.geofusion.splashpage.entities.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class RegisterService
{
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private EmailService emailService;

    public void registerEmail(UserInfo userInfo)
    {
        // salva dados
        entityManager.merge(userInfo);

        // envia email com link para feedback

    }

}
