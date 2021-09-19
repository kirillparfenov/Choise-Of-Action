package com.game.choice_of_action.dao.impl;

import com.game.choice_of_action.api.model.Player;
import com.game.choice_of_action.dao.abstr.PlayerDao;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDaoImpl extends ReadWriteDaoImpl<Long, Player> implements PlayerDao {

}
