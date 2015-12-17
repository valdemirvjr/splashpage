package desafio.geofusion.splashpage.dao;

import desafio.geofusion.splashpage.entities.UserInfo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class UserInfoDAOImpl extends GenericDAOImpl<UserInfo, Integer> implements UserInfoDAO
{
}
