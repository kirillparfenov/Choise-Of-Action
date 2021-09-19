package com.game.choice_of_action.example.factory.product;

public interface Mage {
  void cast();
  void damage(int value);
  void upgrade(Mage mage);
  void skills(boolean up, Mage mage);
  boolean isAlive();
}
