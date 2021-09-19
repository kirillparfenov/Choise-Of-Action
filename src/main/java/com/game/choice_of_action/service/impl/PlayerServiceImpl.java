package com.game.choice_of_action.service.impl;

import com.game.choice_of_action.api.model.Player;
import com.game.choice_of_action.dao.abstr.PlayerDao;
import com.game.choice_of_action.service.abstr.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl extends ReadWriteServiceImpl<Long, Player> implements PlayerService {

  private final PlayerDao playerDao;

  @Autowired
  public PlayerServiceImpl(PlayerDao playerDao) {
    super(playerDao);
    this.playerDao = playerDao;
  }
}
