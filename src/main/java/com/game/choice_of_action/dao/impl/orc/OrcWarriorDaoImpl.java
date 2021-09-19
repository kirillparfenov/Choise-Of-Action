package com.game.choice_of_action.dao.impl.orc;

import com.game.choice_of_action.dao.abstr.orc.OrcWarriorDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.orc.OrcWarrior;
import org.springframework.stereotype.Repository;

@Repository
public class OrcWarriorDaoImpl extends ReadWriteDaoImpl<Long, OrcWarrior> implements OrcWarriorDao {
}
