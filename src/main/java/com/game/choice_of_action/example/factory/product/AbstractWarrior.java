package com.game.choice_of_action.example.factory.product;

import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public abstract class AbstractWarrior implements Warrior {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private final Random random = new Random();
  private String nameHero;
  private int hp;
  private int hit;
  private int strength;
  private int agility;
  private int armor;
  private int level = 1;

  @Override
  public void attack() {
    System.out.println("Abstract warrior shoot");
  }

  @Override
  public void damage(int value) {
    this.hp -= value;
  }

  @Override
  public void upgrade(Warrior warrior) {
    warrior.skills(true, warrior);
  }

  @Override
  public void skills(boolean levelUp, Warrior warrior) {
    if (levelUp) {
      level += 1;
    } else {
      System.out.println("Пока нельзя поднять уровень");
    }
  }

  @Override
  public boolean isAlive() {
    return this.hp > 0;
  }
}
