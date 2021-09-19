package com.game.choice_of_action.dao.impl.human;

import com.game.choice_of_action.dao.abstr.human.HumanMageDao;
import com.game.choice_of_action.dao.impl.ReadWriteDaoImpl;
import com.game.choice_of_action.example.human.HumanMage;
import org.springframework.stereotype.Repository;

@Repository
public class HumanMageDaoImpl extends ReadWriteDaoImpl<Long, HumanMage> implements HumanMageDao {
}
