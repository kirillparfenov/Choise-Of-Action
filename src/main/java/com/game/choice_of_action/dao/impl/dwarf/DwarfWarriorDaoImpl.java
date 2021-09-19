package com.game.choice_of_action.dao.impl.dwarf;

import com.game.choice_of_action.dao.abstr.dwarf.DwarfWarriorDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.dwarf.DwarfWarrior;
import org.springframework.stereotype.Repository;

@Repository
public class DwarfWarriorDaoImpl extends ReadWriteDaoImpl<Long, DwarfWarrior> implements DwarfWarriorDao {

}
