package com.game.choice_of_action.service.abstr;

import java.io.Serializable;
import java.util.List;

public interface ReadOnlyService<K extends Serializable, T> {

    T getByKey (K key);

    boolean isExistByKey (K key);

    List<T> getAll ();
}
