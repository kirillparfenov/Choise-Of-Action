package com.game.choice_of_action.dao.impl.human;

import com.game.choice_of_action.dao.abstr.human.HumanArcherDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.human.HumanArcher;
import org.springframework.stereotype.Repository;

@Repository
public class HumanArcherDaoImpl extends ReadWriteDaoImpl<Long, HumanArcher> implements HumanArcherDao {
}
