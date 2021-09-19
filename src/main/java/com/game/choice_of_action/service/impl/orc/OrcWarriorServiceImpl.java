package com.game.choice_of_action.service.impl.orc;

import com.game.choice_of_action.dao.abstr.orc.OrcWarriorDao;
import com.game.choice_of_action.example.orc.OrcWarrior;
import com.game.choice_of_action.service.abstr.orc.OrcWarriorService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrcWarriorServiceImpl extends ReadWriteServiceImpl<Long, OrcWarrior> implements OrcWarriorService {

  private final OrcWarriorDao orcWarriorDao;

  public OrcWarriorServiceImpl(OrcWarriorDao orcWarriorDao) {
    super(orcWarriorDao);
    this.orcWarriorDao = orcWarriorDao;
  }
}
