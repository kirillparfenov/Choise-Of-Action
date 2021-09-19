package com.game.choice_of_action.example.story;

import java.util.Random;
import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Start {
  private final Scanner scanner = new Scanner(System.in);
  private final Random random = new Random();
  CreateHero createHero = new CreateHero();

  public void startGame() {
    int race;

    log.info("\nДай погоняло персонажу");
    String nameHero = scanner.next();

    log.info("\nТы чьих будешь? (1. Человек, 2. Эльф, 3. Орк, 4. Гном)");
    race = scanner.nextInt();
    createHero.raceChoice(race);
  }


}
