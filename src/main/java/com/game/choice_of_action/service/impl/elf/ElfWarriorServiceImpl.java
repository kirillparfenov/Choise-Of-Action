package com.game.choice_of_action.service.impl.elf;

import com.game.choice_of_action.dao.abstr.elf.ElfWarriorDao;
import com.game.choice_of_action.example.elf.ElfWarrior;
import com.game.choice_of_action.service.abstr.elf.ElfWarriorService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ElfWarriorServiceImpl extends ReadWriteServiceImpl<Long, ElfWarrior> implements ElfWarriorService {

  private final ElfWarriorDao elfWarriorDao;

  public ElfWarriorServiceImpl(ElfWarriorDao elfWarriorDao) {
    super(elfWarriorDao);
    this.elfWarriorDao = elfWarriorDao;
  }
}
