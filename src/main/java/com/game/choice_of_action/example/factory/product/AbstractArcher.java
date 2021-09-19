package com.game.choice_of_action.example.factory.product;

import java.util.Random;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@DiscriminatorColumn(name = "Archer_type", discriminatorType = DiscriminatorType.STRING)
public abstract class AbstractArcher implements Archer {

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
  public void shoot() {
    System.out.println("Abstract archer shoot");
  }

  @Override
  public void damage(int value) {
    this.hp -= value;
  }

  @Override
  public void upgrade(Archer archer) {
    archer.skills(true, archer);
  }

  @Override
  public void skills(boolean levelUp, Archer archer) {
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
