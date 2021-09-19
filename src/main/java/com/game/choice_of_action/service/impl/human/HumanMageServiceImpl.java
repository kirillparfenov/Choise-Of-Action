package com.game.choice_of_action.service.impl.human;

import com.game.choice_of_action.dao.abstr.human.HumanMageDao;
import com.game.choice_of_action.example.human.HumanMage;
import com.game.choice_of_action.service.abstr.human.HumanMageService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HumanMageServiceImpl extends ReadWriteServiceImpl<Long, HumanMage> implements HumanMageService {

  private final HumanMageDao humanMageDao;

  public HumanMageServiceImpl(HumanMageDao humanMageDao) {
    super(humanMageDao);
    this.humanMageDao = humanMageDao;
  }
}
