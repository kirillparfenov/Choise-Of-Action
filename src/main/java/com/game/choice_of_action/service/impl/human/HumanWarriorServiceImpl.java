package com.game.choice_of_action.service.impl.human;

import com.game.choice_of_action.dao.abstr.human.HumanWarriorDao;
import com.game.choice_of_action.example.human.HumanWarrior;
import com.game.choice_of_action.service.abstr.human.HumanWarriorService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HumanWarriorServiceImpl extends ReadWriteServiceImpl<Long, HumanWarrior> implements HumanWarriorService {

  private final HumanWarriorDao humanWarriorDao;

  public HumanWarriorServiceImpl(HumanWarriorDao humanWarriorDao) {
    super(humanWarriorDao);
    this.humanWarriorDao = humanWarriorDao;
  }
}
