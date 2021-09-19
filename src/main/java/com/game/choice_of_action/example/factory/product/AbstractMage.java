package com.game.choice_of_action.example.factory.product;

import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public abstract class AbstractMage implements Mage {

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
  public void cast() {
    System.out.println("Abstract mage shoot");
  }

  @Override
  public void damage(int value) {
    this.hp -= value;
  }

  @Override
  public void upgrade(Mage mage) {
    mage.skills(true, mage);
  }

  @Override
  public void skills(boolean levelUp, Mage mage) {
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
