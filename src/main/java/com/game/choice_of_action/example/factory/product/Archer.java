package com.game.choice_of_action.example.factory.product;

public interface Archer {
  void shoot();
  void damage(int value);
  void upgrade(Archer archer);
  void skills(boolean up, Archer archer);
  boolean isAlive();
}
