package com.game.choice_of_action.service.impl.orc;

import com.game.choice_of_action.dao.abstr.orc.OrcMageDao;
import com.game.choice_of_action.example.orc.OrcMage;
import com.game.choice_of_action.service.abstr.orc.OrcMageService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrcMageServiceImpl extends ReadWriteServiceImpl<Long, OrcMage> implements OrcMageService {

  private final OrcMageDao orcMageDao;

  public OrcMageServiceImpl(OrcMageDao orcMageDao) {
    super(orcMageDao);
    this.orcMageDao = orcMageDao;
  }
}
