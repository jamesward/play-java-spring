package daos;

import java.io.Serializable;

public class GenericDaoImpl<T, PK extends Serializable> extends GenericDaoJpa<T, PK> {


    public GenericDaoImpl(Class persistentClass) {
        super(persistentClass);
    }
}
