package com.game.choice_of_action.example.human;

import com.game.choice_of_action.example.factory.product.AbstractArcher;
import com.game.choice_of_action.example.factory.product.Archer;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@DiscriminatorValue("HUMAN_ARCHER")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class HumanArcher extends AbstractArcher implements Archer {

  private int hp = 100;
  private int hit = 40;
  private int strength = 8;
  private int agility = 7;
  private int armor = 8;

  @Override
  public void shoot() {
    System.out.println("Human archer shoot");
  }

  @Override
  public void damage(int value) {
    super.damage(value);
  }

  @Override
  public void upgrade(Archer archer) {
    super.upgrade(archer);
  }

  @Override
  public void skills(boolean levelUp, Archer archer) {
    super.skills(levelUp, archer);
  }

  @Override
  public boolean isAlive() {
    return super.isAlive();
  }
}
