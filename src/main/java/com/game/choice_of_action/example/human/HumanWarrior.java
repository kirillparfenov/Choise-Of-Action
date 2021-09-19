package com.game.choice_of_action.example.human;

import com.game.choice_of_action.example.factory.product.AbstractWarrior;
import com.game.choice_of_action.example.factory.product.Warrior;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("HUMAN_WARRIOR")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class HumanWarrior extends AbstractWarrior implements Warrior {

  private int hp = 220;
  private int hit = 70;
  private int strength = 8;
  private int agility = 7;
  private int armor = 8;

  @Override
  public void attack() {
    System.out.println("Human warrior attack");
  }

  @Override
  public void damage(int value) {
    super.damage(value);
  }

  @Override
  public void upgrade(Warrior warrior) {
    super.upgrade(warrior);
  }

  @Override
  public void skills(boolean levelUp, Warrior warrior) {
    super.skills(levelUp, warrior);
  }

  @Override
  public boolean isAlive() {
    return super.isAlive();
  }
}
