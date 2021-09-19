package com.game.choice_of_action.example.factory.product;

public interface Warrior {
  void attack();
  void damage(int value);
  void upgrade(Warrior warrior);
  void skills(boolean up, Warrior warrior);
  boolean isAlive();
}
