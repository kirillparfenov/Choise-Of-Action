package com.game.choice_of_action;

import com.game.choice_of_action.example.story.Rule;
import com.game.choice_of_action.example.story.Start;
import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainClass {

  public static void main(String[] args) {
    log.info("\nЭто ролевая игра \n 1. Запустить игру \n 2. Правила игры \n 3. Завершить игру");
    Scanner scanner = new Scanner(System.in);
    switch(scanner.nextInt()){
      case 1:
        new Start().startGame(); // создание ролей
        break;
      case 2:
        new Rule().rule();// просмотр правил
        break;
      default:
        log.info("\nИгра окончена!");
        System.exit (0);
    }



    /*AbstractArmyFactory factory1 = new ElfArmyFactory();
    Archer archer1 = factory1.createArcher();
    Warrior warrior1 = factory1.createWarrior();
    archer1.shoot();
    warrior1.attack();
    AbstractArmyFactory factory2 = new DwarfArmyFactory();
    Archer archer2 = factory2.createArcher();
    Warrior warrior2 = factory2.createWarrior();
    archer2.shoot();
    warrior2.attack();*/
  }
}
