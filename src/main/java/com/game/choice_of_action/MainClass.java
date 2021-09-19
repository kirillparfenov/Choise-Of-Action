package com.game.choice_of_action;

import com.game.choice_of_action.example.story.Start;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainClass {

  public static void main(String[] args) {
    new Start().startMenu();
    // TODO сделать сохранение персонажа.
  }
}
