package com.game.choice_of_action.example.factory;

import com.game.choice_of_action.example.factory.product.Archer;
import com.game.choice_of_action.example.factory.product.Mage;
import com.game.choice_of_action.example.factory.product.Warrior;
import com.game.choice_of_action.example.human.HumanArcher;
import com.game.choice_of_action.example.human.HumanMage;
import com.game.choice_of_action.example.human.HumanWarrior;

public class HumanHeroFactory implements AbstractHeroFactory {

  @Override
  public Warrior createWarrior() {
    return new HumanWarrior();
  }

  @Override
  public Archer createArcher() {
    return new HumanArcher();
  }

  @Override
  public Mage createMage() {
    return new HumanMage();
  }
}
