package com.game.choice_of_action.dao.impl.human;

import com.game.choice_of_action.dao.abstr.human.HumanWarriorDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.human.HumanWarrior;
import org.springframework.stereotype.Repository;

@Repository
public class HumanWarriorDaoImpl extends ReadWriteDaoImpl<Long, HumanWarrior> implements HumanWarriorDao {
}
