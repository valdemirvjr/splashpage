package desafio.geofusion.splashpage.dao;

import java.io.Serializable;
import java.util.Collection;

public interface GenericDAO<T, K extends Serializable>
{
    T create(T t);

    T read(K k);

    T update(T t);

    void delete(T t);

    Collection<T> readAll();
}
