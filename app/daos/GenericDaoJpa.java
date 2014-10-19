package daos;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericDaoJpa<T, PK extends Serializable> implements GenericDao<T, PK> {

    @PersistenceContext
    protected EntityManager entityManager;

    private Class<T> persistentClass;

    public GenericDaoJpa(final Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void save(Object object) {
        entityManager.persist(object);
    }

    @Override
    public List<T> getAll() {
        CriteriaQuery<T> c = getEntityManager().getCriteriaBuilder().createQuery(persistentClass);
        c.from(persistentClass);

        return getEntityManager().createQuery(c).getResultList();
    }

}
