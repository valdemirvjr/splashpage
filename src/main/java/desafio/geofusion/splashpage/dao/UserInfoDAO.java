package desafio.geofusion.splashpage.dao;

import desafio.geofusion.splashpage.entities.UserInfo;

public interface UserInfoDAO extends GenericDAO<UserInfo, Integer>
{
    public UserInfo findByEmail(String email);
}
