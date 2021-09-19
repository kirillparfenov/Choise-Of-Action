package com.game.choice_of_action.example.story;

import java.util.Random;
import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Start {
  private final Scanner scanner = new Scanner(System.in);
  private final Random random = new Random();
  CreateHero createHero = new CreateHero();

  public void startMenu() {
    log.info("\nЭто ролевая игра \n 1. Запустить игру \n 2. Правила игры \n 3. Загрузить игру \n 4. Завершить игру");
    Scanner scanner = new Scanner(System.in);
    switch(scanner.nextInt()){
      case 1:
        new Start().startGame(); // создание ролей
        break;
      case 2:
        new Rule().rule();// просмотр правил
        break;
      case 3:
        System.out.println("Здесь будет загрузка последнего сохранения");
        break;
      default:
        log.info("\nИгра окончена!");
        System.exit (0);
    }
  }

  public void startGame() {

    log.info("\nДай прозвище персонажу");
    String nameHero = scanner.next();

    log.info("\nТы чьих будешь? (1. Человек, 2. Эльф, 3. Орк, 4. Гном)");
    int race = scanner.nextInt();
    createHero.raceChoice(race, nameHero);
  }
}
