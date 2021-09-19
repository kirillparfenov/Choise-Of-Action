package com.game.choice_of_action.example.factory;

import com.game.choice_of_action.example.dwarf.DwarfArcher;
import com.game.choice_of_action.example.dwarf.DwarfMage;
import com.game.choice_of_action.example.dwarf.DwarfWarrior;
import com.game.choice_of_action.example.factory.product.Archer;
import com.game.choice_of_action.example.factory.product.Mage;
import com.game.choice_of_action.example.factory.product.Warrior;
import org.springframework.stereotype.Component;

@Component
public class DwarfHeroFactory implements AbstractHeroFactory {

  @Override
  public Warrior createWarrior(String nameHero) {
    DwarfWarrior dwarfWarrior = new DwarfWarrior();
    dwarfWarrior.setNameHero(nameHero);
    return dwarfWarrior;
  }

  @Override
  public Archer createArcher(String nameHero) {
    DwarfArcher dwarfArcher = new DwarfArcher();
    dwarfArcher.setNameHero(nameHero);
    return dwarfArcher;
  }

  @Override
  public Mage createMage(String nameHero) {
    DwarfMage dwarfMage = new DwarfMage();
    dwarfMage.setNameHero(nameHero);
    return dwarfMage;
  }
}
