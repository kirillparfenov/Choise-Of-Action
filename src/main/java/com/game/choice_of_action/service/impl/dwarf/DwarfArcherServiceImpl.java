package com.game.choice_of_action.service.impl.dwarf;

import com.game.choice_of_action.dao.abstr.dwarf.DwarfArcherDao;
import com.game.choice_of_action.example.dwarf.DwarfArcher;
import com.game.choice_of_action.service.abstr.dwarf.DwarfArcherService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DwarfArcherServiceImpl extends ReadWriteServiceImpl<Long, DwarfArcher> implements DwarfArcherService {

  private final DwarfArcherDao dwarfArcherDao;

  public DwarfArcherServiceImpl(DwarfArcherDao dwarfArcherDao) {
    super(dwarfArcherDao);
    this.dwarfArcherDao = dwarfArcherDao;
  }
}
