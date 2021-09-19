package com.game.choice_of_action.example.factory;

import com.game.choice_of_action.example.factory.product.Archer;
import com.game.choice_of_action.example.factory.product.Mage;
import com.game.choice_of_action.example.factory.product.Warrior;

public interface AbstractHeroFactory {

  Warrior createWarrior(String nameHero);
  Archer createArcher(String nameHero);
  Mage createMage(String nameHero);
}
