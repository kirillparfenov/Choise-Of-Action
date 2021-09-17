package com.game.choice_of_action;

import com.game.choice_of_action.api.model.AbstractArmyFactory;
import com.game.choice_of_action.api.model.Archer;
import com.game.choice_of_action.api.model.DwarfArmyFactory;
import com.game.choice_of_action.api.model.ElfArmyFactory;
import com.game.choice_of_action.api.model.Warrior;

public class MainClass {

  public static void main(String[] args)
  {
    AbstractArmyFactory factory1 = new ElfArmyFactory();
    Archer archer1 = factory1.createArcher();
    Warrior warrior1 = factory1.createWarrior();
    archer1.shoot();
    warrior1.attack();
    AbstractArmyFactory factory2 = new DwarfArmyFactory();
    Archer archer2 = factory2.createArcher();
    Warrior warrior2 = factory2.createWarrior();
    archer2.shoot();
    warrior2.attack();
  }
}
