package com.game.choice_of_action.api.model;

public class ElfArmyFactory implements AbstractArmyFactory {

  @Override
  public Archer createArcher() {
    return new ElfArcher();
  }

  @Override
  public Warrior createWarrior() {
    return new ElfWarrior();
  }
}
