package com.game.choice_of_action.example.factory;

import com.game.choice_of_action.example.factory.product.Archer;
import com.game.choice_of_action.example.factory.product.Mage;
import com.game.choice_of_action.example.factory.product.Warrior;
import com.game.choice_of_action.example.human.HumanArcher;
import com.game.choice_of_action.example.human.HumanMage;
import com.game.choice_of_action.example.human.HumanWarrior;

public class HumanHeroFactory implements AbstractHeroFactory {

  @Override
  public Warrior createWarrior(String nameHero) {
    HumanWarrior humanWarrior = new HumanWarrior();
    humanWarrior.setNameHero(nameHero);
    return humanWarrior;
  }

  @Override
  public Archer createArcher(String nameHero) {
    HumanArcher humanArcher = new HumanArcher();
    humanArcher.setNameHero(nameHero);
    //humanArcherService.persist(humanArcher);
    return humanArcher;
  }

  @Override
  public Mage createMage(String nameHero) {
    HumanMage humanMage = new HumanMage();
    humanMage.setNameHero(nameHero);
    return humanMage;
  }
}
