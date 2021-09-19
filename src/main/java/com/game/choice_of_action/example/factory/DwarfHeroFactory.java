package com.game.choice_of_action.example.factory;

import com.game.choice_of_action.example.dwarf.DwarfArcher;
import com.game.choice_of_action.example.dwarf.DwarfMage;
import com.game.choice_of_action.example.dwarf.DwarfWarrior;
import com.game.choice_of_action.example.factory.product.Archer;
import com.game.choice_of_action.example.factory.product.Mage;
import com.game.choice_of_action.example.factory.product.Warrior;

public class DwarfHeroFactory implements AbstractHeroFactory {

  @Override
  public Warrior createWarrior() {
    return new DwarfWarrior();
  }

  @Override
  public Archer createArcher() {
    return new DwarfArcher();
  }

  @Override
  public Mage createMage() {
    return new DwarfMage();
  }
}
