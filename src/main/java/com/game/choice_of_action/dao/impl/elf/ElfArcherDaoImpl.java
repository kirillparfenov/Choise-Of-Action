package com.game.choice_of_action.dao.impl.elf;

import com.game.choice_of_action.dao.abstr.elf.ElfArcherDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.elf.ElfArcher;
import org.springframework.stereotype.Repository;

@Repository
public class ElfArcherDaoImpl extends ReadWriteDaoImpl<Long, ElfArcher> implements ElfArcherDao {
}
