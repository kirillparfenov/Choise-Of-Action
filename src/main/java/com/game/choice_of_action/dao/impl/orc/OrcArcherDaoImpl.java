package com.game.choice_of_action.dao.impl.orc;

import com.game.choice_of_action.dao.abstr.orc.OrcArcherDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.orc.OrcArcher;
import org.springframework.stereotype.Repository;

@Repository
public class OrcArcherDaoImpl extends ReadWriteDaoImpl<Long, OrcArcher> implements OrcArcherDao {
}
