package com.game.choice_of_action.dao.impl.dwarf;

import com.game.choice_of_action.dao.abstr.dwarf.DwarfArcherDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.dwarf.DwarfArcher;
import org.springframework.stereotype.Repository;

@Repository
public class DwarfArcherDaoImpl extends ReadWriteDaoImpl<Long, DwarfArcher> implements DwarfArcherDao {
}
