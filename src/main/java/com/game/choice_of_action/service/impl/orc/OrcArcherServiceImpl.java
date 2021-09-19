package com.game.choice_of_action.service.impl.orc;

import com.game.choice_of_action.dao.abstr.orc.OrcArcherDao;
import com.game.choice_of_action.example.orc.OrcArcher;
import com.game.choice_of_action.service.abstr.orc.OrcArcherService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrcArcherServiceImpl extends ReadWriteServiceImpl<Long, OrcArcher> implements OrcArcherService {

  private final OrcArcherDao orcArcherDao;

  public OrcArcherServiceImpl(OrcArcherDao orcArcherDao) {
    super(orcArcherDao);
    this.orcArcherDao = orcArcherDao;
  }
}
