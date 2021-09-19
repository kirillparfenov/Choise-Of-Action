package com.game.choice_of_action.service.impl.human;

import com.game.choice_of_action.dao.abstr.human.HumanArcherDao;
import com.game.choice_of_action.example.human.HumanArcher;
import com.game.choice_of_action.service.abstr.human.HumanArcherService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HumanArcherServiceImpl extends ReadWriteServiceImpl<Long, HumanArcher> implements HumanArcherService {

  private final HumanArcherDao humanArcherDao;

  public HumanArcherServiceImpl(HumanArcherDao humanArcherDao) {
    super(humanArcherDao);
    this.humanArcherDao = humanArcherDao;
  }
}
