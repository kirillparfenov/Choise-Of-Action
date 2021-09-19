package com.game.choice_of_action.service.impl;

import com.game.choice_of_action.dao.abstr.ReadOnlyDao;
import java.io.Serializable;
import java.util.List;

public abstract class ReadOnlyServiceImpl<K extends Serializable, T> {

    private final ReadOnlyDao<K, T> readOnlyDao;

    protected ReadOnlyServiceImpl(ReadOnlyDao<K, T> readOnlyDao) {
        this.readOnlyDao = readOnlyDao;
    }

    public T getByKey(K key) {
        return readOnlyDao.getByKey(key);
    }

    public boolean isExistByKey(K key) {
        return readOnlyDao.isExistByKey(key);
    }

    public List<T> getAll() {
        return readOnlyDao.getAll();
    }
}
