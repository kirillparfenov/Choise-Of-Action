package com.game.choice_of_action.example.story;

import com.game.choice_of_action.example.factory.AbstractHeroFactory;
import com.game.choice_of_action.example.factory.DwarfHeroFactory;
import com.game.choice_of_action.example.factory.ElfHeroFactory;
import com.game.choice_of_action.example.factory.HumanHeroFactory;
import com.game.choice_of_action.example.factory.OrcHeroFactory;
import com.game.choice_of_action.example.factory.product.Archer;
import com.game.choice_of_action.example.factory.product.Mage;
import com.game.choice_of_action.example.factory.product.Warrior;
import com.game.choice_of_action.service.abstr.human.HumanWarriorService;
import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class CreateHero {
  private final Scanner scanner = new Scanner(System.in);

  public void raceChoice(int race, String nameHero) {
    String trigger = "\nВведи одно из предложенных чисел";
    int check;

    while (true) {
      if (race >= 1 && race <= 4) {
        switch (race) { // Выбор специализации
          case 1: // Люди
            log.info("\nВыбери специализацию: (1. Паладин, 2. Арбалетчик, 3. Маг)");
            check = scanner.nextInt();
            while (true) {
              if (check >= 1 && check <= 3) {
                AbstractHeroFactory factory = new HumanHeroFactory();
                choiceOfSpecialization(factory, check, nameHero);
                break;
              } else {
                log.info(trigger);
                check = scanner.nextInt();
              }
            }
            break;
          case 2: // Эльфы
            log.info("\nВыбери специализацию: (1. Охотник, 2. Лучник, 3. Маг)");
            check = scanner.nextInt();
            while (true) {
              if (check >= 1 && check <= 3) {
                AbstractHeroFactory factory = new ElfHeroFactory();
                choiceOfSpecialization(factory, check, nameHero);
                break;
              } else {
                log.info(trigger);
                check = scanner.nextInt();
              }
            }
            break;
          case 3: // Орки
            log.info("\nВыбери специализацию: (1. Берсерк, 2. Метатель топора, 3. Жрец)");
            check = scanner.nextInt();
            while (true) {
              if (check >= 1 && check <= 3) {
                AbstractHeroFactory factory = new OrcHeroFactory();
                choiceOfSpecialization(factory, check, nameHero);
                break;
              } else {
                log.info(trigger);
                check = scanner.nextInt();
              }
            }
            break;
          default: // Гномы
            log.info("\nВыбери специализацию: (1. Горняк, 2. Егерь, 3. Волшебник)");
            check = scanner.nextInt();
            while (true) {
              if (check >= 1 && check <= 3) {
                AbstractHeroFactory factory = new DwarfHeroFactory();
                choiceOfSpecialization(factory, check, nameHero);
                break;
              } else {
                log.info(trigger);
                check = scanner.nextInt();
              }
            }
            break;
        }
        break;
      } else {
        log.info(trigger);
        race = scanner.nextInt();
      }
    }
  }

  public void choiceOfSpecialization(AbstractHeroFactory factory, int check, String nameHero) {
    if (check == 1) {
      Warrior warrior = factory.createWarrior(nameHero);
      System.err.println(warrior);
      warrior.attack();
    } else if (check == 2) {
      Archer archer = factory.createArcher(nameHero);
      archer.shoot();
    } else {
      Mage mage = factory.createMage(nameHero);
      mage.cast();
    }
  }
}
