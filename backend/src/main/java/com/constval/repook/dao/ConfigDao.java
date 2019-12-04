package com.constval.repook.dao;


import com.constval.repook.model.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
public class ConfigDao implements Dao<Config> {

    @Autowired
    EntityManager entityManager;


    @Override
    public Optional<Config> get(long id) {

//        List entityList = entityManager.createQuery("select config from Configuration config where config.ID = :id", Config.class)
//                .setParameter("id", id)
//                .getResultList();
//        Optional entity = Optional.of(entityList.get(0));

        return Optional.empty();
    }

    @Override
    public List<Config> getAll() {
//        List<Config> entityList = entityManager.createQuery("select config from Configuration config", Config.class)
//                .getResultList();
        List<Config> entityList = new ArrayList<>();
        Config config = new Config();
        config.setTestValue("testvalue");
        entityList.add(config);
        return entityList;
    }

    @Override
    public void save(Config config) {
//        entityManager.createQuery("insert into Configuration ('TestValue') values (:value)")
//        .setParameter("value", config.getValue());
    }

    @Override
    public void update(Config config, String[] params) {

    }

    @Override
    public void delete(Config config) {

    }
}
