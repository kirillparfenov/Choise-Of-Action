package com.game.choice_of_action.service.impl.dwarf;

import com.game.choice_of_action.dao.abstr.dwarf.DwarfMageDao;
import com.game.choice_of_action.example.dwarf.DwarfMage;
import com.game.choice_of_action.service.abstr.dwarf.DwarfMageService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DwarfMageServiceImpl extends ReadWriteServiceImpl<Long, DwarfMage> implements DwarfMageService {

  private final DwarfMageDao dwarfMageDao;

  public DwarfMageServiceImpl(DwarfMageDao dwarfMageDao) {
    super(dwarfMageDao);
    this.dwarfMageDao = dwarfMageDao;
  }
}
