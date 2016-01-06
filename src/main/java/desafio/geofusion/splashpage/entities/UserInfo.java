package desafio.geofusion.splashpage.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NamedQueries({
        @NamedQuery(name = UserInfo.FIND_USERINFO_BY_EMAIL, query = "select u from UserInfo u where u.email = :email")
})
public class UserInfo implements Serializable
{
    public static final String FIND_USERINFO_BY_EMAIL = "UserInfo.findByEmail";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String email;

    private String name;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "UserInfo{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
