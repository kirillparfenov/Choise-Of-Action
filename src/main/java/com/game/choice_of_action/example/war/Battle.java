package com.game.choice_of_action.example.war;

import com.game.choice_of_action.example.factory.product.Archer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Battle {

  private Archer heroFirst;
  private Archer heroSecond;

  public void init() {
    /*do {
      if (heroFirst.move()) {
        heroFirst.damage(5L);
      } else {
        heroSecond.damage(5L);
      }
    } while(this.heroFirst.isAlive() && this.heroSecond.isAlive());*/
  }
}
