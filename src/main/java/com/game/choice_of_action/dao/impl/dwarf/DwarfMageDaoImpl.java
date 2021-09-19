package com.game.choice_of_action.dao.impl.dwarf;

import com.game.choice_of_action.dao.abstr.dwarf.DwarfMageDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.dwarf.DwarfMage;
import org.springframework.stereotype.Repository;

@Repository
public class DwarfMageDaoImpl extends ReadWriteDaoImpl<Long, DwarfMage> implements DwarfMageDao {
}
