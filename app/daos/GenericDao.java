package daos;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GenericDao<T, PK extends Serializable> {

    public void save(Object object);

    public List<T> getAll();


}
