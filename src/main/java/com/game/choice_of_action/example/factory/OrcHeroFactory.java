package com.game.choice_of_action.example.factory;

import com.game.choice_of_action.example.factory.product.Archer;
import com.game.choice_of_action.example.factory.product.Mage;
import com.game.choice_of_action.example.factory.product.Warrior;
import com.game.choice_of_action.example.orc.OrcArcher;
import com.game.choice_of_action.example.orc.OrcMage;
import com.game.choice_of_action.example.orc.OrcWarrior;

public class OrcHeroFactory implements AbstractHeroFactory {

  @Override
  public Warrior createWarrior() {
    return new OrcWarrior();
  }

  @Override
  public Archer createArcher() {
    return new OrcArcher();
  }

  @Override
  public Mage createMage() {
    return new OrcMage();
  }
}
