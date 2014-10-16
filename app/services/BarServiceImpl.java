package services;


import daos.BarDao;
import models.Bar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import play.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Service
public class BarServiceImpl implements BarService {

    @Autowired
    private BarDao barDao;

    @Override
    public void addBar(Bar bar) {
        barDao.save(bar);
    }

    @Override
    public List<Bar> getAllBars() {
        return barDao.getAll();
    }

}