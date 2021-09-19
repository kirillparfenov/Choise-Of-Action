package com.game.choice_of_action.example.factory;

import com.game.choice_of_action.example.elf.ElfArcher;
import com.game.choice_of_action.example.elf.ElfMage;
import com.game.choice_of_action.example.elf.ElfWarrior;
import com.game.choice_of_action.example.factory.product.Archer;
import com.game.choice_of_action.example.factory.product.Mage;
import com.game.choice_of_action.example.factory.product.Warrior;

public class ElfHeroFactory implements AbstractHeroFactory {

  @Override
  public Warrior createWarrior() {
    return new ElfWarrior();
  }

  @Override
  public Archer createArcher() {
    return new ElfArcher();
  }

  @Override
  public Mage createMage() {
    return new ElfMage();
  }
}
