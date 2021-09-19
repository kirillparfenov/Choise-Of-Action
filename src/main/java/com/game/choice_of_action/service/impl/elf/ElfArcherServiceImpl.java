package com.game.choice_of_action.service.impl.elf;

import com.game.choice_of_action.dao.abstr.elf.ElfArcherDao;
import com.game.choice_of_action.example.elf.ElfArcher;
import com.game.choice_of_action.service.abstr.elf.ElfArcherService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ElfArcherServiceImpl extends ReadWriteServiceImpl<Long, ElfArcher> implements ElfArcherService {

  private final ElfArcherDao elfArcherDao;

  public ElfArcherServiceImpl(ElfArcherDao elfArcherDao) {
    super(elfArcherDao);
    this.elfArcherDao = elfArcherDao;
  }
}
