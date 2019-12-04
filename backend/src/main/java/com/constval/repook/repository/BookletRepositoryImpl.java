package com.constval.repook.repository;

import com.constval.repook.dao.ConfigDao;
import com.constval.repook.model.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * This class includes the access to all methods for getting and saving booklet data
 */
@Component
@Scope("prototype")
public class BookletRepositoryImpl implements BookletRepository {

    @Autowired
    ConfigDao configDao;

    @Override
    public List<Config> getAllConfigEntitys() {
        return configDao.getAll();
    }

    public void saveConfig(Config config) {
        configDao.save(config);
    }

}
