package com.game.choice_of_action.dao.abstr;

import java.io.Serializable;
import java.util.List;

public interface ReadOnlyDao<K extends Serializable, T> {

    T getByKey (K key);
    boolean isExistByKey (K key);
    List<T> getAll ();
}
