package com.game.choice_of_action.api.model;

public class DwarfArmyFactory implements AbstractArmyFactory {

  @Override
  public Archer createArcher() {
    return new DwarfArcher();
  }

  @Override
  public Warrior createWarrior() {
    return new DwarfWarrior();
  }
}
