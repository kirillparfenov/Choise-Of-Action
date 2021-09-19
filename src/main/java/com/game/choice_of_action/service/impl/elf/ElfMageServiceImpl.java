package com.game.choice_of_action.service.impl.elf;

import com.game.choice_of_action.dao.abstr.elf.ElfMageDao;
import com.game.choice_of_action.example.elf.ElfMage;
import com.game.choice_of_action.service.abstr.elf.ElfMageService;
import com.game.choice_of_action.service.impl.ReadWriteServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ElfMageServiceImpl extends ReadWriteServiceImpl<Long, ElfMage> implements ElfMageService {

  private final ElfMageDao elfMageDao;

  public ElfMageServiceImpl(ElfMageDao elfMageDao) {
    super(elfMageDao);
    this.elfMageDao = elfMageDao;
  }
}
