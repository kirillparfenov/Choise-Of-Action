package com.game.choice_of_action.example.orc;

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
@DiscriminatorValue("ORC_WARRIOR")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class OrcWarrior extends AbstractWarrior implements Warrior {

  private int hp = 250;
  private int hit = 90;
  private int strength = 10;
  private int agility = 3;
  private int armor = 6;

  @Override
  public void attack() {
    System.out.println("Orc warrior attack");
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
