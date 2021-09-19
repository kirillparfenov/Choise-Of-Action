package com.game.choice_of_action.example.factory;

import com.game.choice_of_action.example.factory.product.Archer;
import com.game.choice_of_action.example.factory.product.Mage;
import com.game.choice_of_action.example.factory.product.Warrior;
import com.game.choice_of_action.example.orc.OrcArcher;
import com.game.choice_of_action.example.orc.OrcMage;
import com.game.choice_of_action.example.orc.OrcWarrior;
import org.springframework.stereotype.Component;

@Component
public class OrcHeroFactory implements AbstractHeroFactory {

  @Override
  public Warrior createWarrior(String nameHero) {
    OrcWarrior orcWarrior = new OrcWarrior();
    orcWarrior.setNameHero(nameHero);
    return orcWarrior;
  }

  @Override
  public Archer createArcher(String nameHero) {
    OrcArcher orcArcher = new OrcArcher();
    orcArcher.setNameHero(nameHero);
    return orcArcher;
  }

  @Override
  public Mage createMage(String nameHero) {
    OrcMage orcMage = new OrcMage();
    orcMage.setNameHero(nameHero);
    return orcMage;
  }
}
