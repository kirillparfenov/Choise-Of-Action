package com.game.choice_of_action.dao.impl.orc;

import com.game.choice_of_action.dao.abstr.orc.OrcMageDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.orc.OrcMage;
import org.springframework.stereotype.Repository;

@Repository
public class OrcMageDaoImpl extends ReadWriteDaoImpl<Long, OrcMage> implements OrcMageDao {
}
