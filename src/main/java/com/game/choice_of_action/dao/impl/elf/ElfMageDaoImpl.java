package com.game.choice_of_action.dao.impl.elf;

import com.game.choice_of_action.dao.abstr.elf.ElfMageDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.elf.ElfMage;
import org.springframework.stereotype.Repository;

@Repository
public class ElfMageDaoImpl extends ReadWriteDaoImpl<Long, ElfMage> implements ElfMageDao {
}
