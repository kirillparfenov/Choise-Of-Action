package com.game.choice_of_action.service.impl.dwarf;

import com.game.choice_of_action.dao.abstr.dwarf.DwarfWarriorDao;
import com.game.choice_of_action.example.dwarf.DwarfWarrior;
import com.game.choice_of_action.service.abstr.dwarf.DwarfWarriorService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DwarfWarriorServiceImpl extends ReadWriteServiceImpl<Long, DwarfWarrior> implements DwarfWarriorService {

  private final DwarfWarriorDao dwarfWarriorDao;

  public DwarfWarriorServiceImpl(DwarfWarriorDao dwarfWarriorDao) {
    super(dwarfWarriorDao);
    this.dwarfWarriorDao = dwarfWarriorDao;
  }
}
