package com.game.choice_of_action.example.factory;

import com.game.choice_of_action.example.elf.ElfArcher;
import com.game.choice_of_action.example.elf.ElfMage;
import com.game.choice_of_action.example.elf.ElfWarrior;
import com.game.choice_of_action.example.factory.product.Archer;
import com.game.choice_of_action.example.factory.product.Mage;
import com.game.choice_of_action.example.factory.product.Warrior;
import org.springframework.stereotype.Component;

@Component
public class ElfHeroFactory implements AbstractHeroFactory {

  @Override
  public Warrior createWarrior(String nameHero) {
    ElfWarrior elfWarrior = new ElfWarrior();
    elfWarrior.setNameHero(nameHero);
    return elfWarrior;
  }

  @Override
  public Archer createArcher(String nameHero) {
    ElfArcher elfArcher = new ElfArcher();
    elfArcher.setNameHero(nameHero);
    return elfArcher;
  }

  @Override
  public Mage createMage(String nameHero) {
    ElfMage elfMage = new ElfMage();
    elfMage.setNameHero(nameHero);
    return elfMage;
  }
}
