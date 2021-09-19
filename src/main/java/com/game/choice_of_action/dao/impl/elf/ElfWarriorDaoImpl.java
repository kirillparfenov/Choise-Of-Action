package com.game.choice_of_action.dao.impl.elf;

import com.game.choice_of_action.dao.abstr.elf.ElfWarriorDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.elf.ElfWarrior;
import org.springframework.stereotype.Repository;

@Repository
public class ElfWarriorDaoImpl extends ReadWriteDaoImpl<Long, ElfWarrior> implements ElfWarriorDao {
}
