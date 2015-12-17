package desafio.geofusion.splashpage.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;

@Repository
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public abstract class GenericDAOImpl<T, K extends Serializable> implements GenericDAO<T, K>
{
    @PersistenceContext
    protected EntityManager entityManager;

    private Class<T> clazzT;

    public GenericDAOImpl() {
        // Obter o class do primeiro type argument
        this.clazzT = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public T create(T t)
    {
        entityManager.persist(t);

        // pra gerar o id antes de sair do metodo
        entityManager.flush();

        return t;
    }

    @Override
    public T read(K k)
    {
        return entityManager.find(clazzT, k);
    }

    @Override
    public T update(T t)
    {
        return entityManager.merge(t);
    }

    @Override
    public void delete(T t)
    {
        entityManager.remove(t);
    }

    @Override
    public Collection<T> readAll()
    {
        return entityManager.createQuery("from " + clazzT.getName()).getResultList();
    }
}
