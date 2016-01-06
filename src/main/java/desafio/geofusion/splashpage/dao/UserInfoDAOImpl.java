package desafio.geofusion.splashpage.dao;

import desafio.geofusion.splashpage.entities.UserInfo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import javax.persistence.Query;

@Repository
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class UserInfoDAOImpl extends GenericDAOImpl<UserInfo, Integer> implements UserInfoDAO
{
    @Override
    public UserInfo findByEmail(String email)
    {
        Query findByEmailQuery = entityManager.createNamedQuery(UserInfo.FIND_BY_EMAIL);
        findByEmailQuery.setParameter("email", email);

        try
        {
            return (UserInfo) findByEmailQuery.getSingleResult();
        }
        catch (NoResultException e)
        {
            return null;
        }

    }
}
