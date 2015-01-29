package daos;

import models.Bar;
import org.springframework.stereotype.Repository;


@Repository
public class BarDaoImpl extends GenericDaoImpl<Bar, String> implements BarDao {

    public BarDaoImpl() {
        super(Bar.class);
    }

}
