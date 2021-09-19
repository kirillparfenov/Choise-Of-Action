package com.game.choice_of_action.example.human;

import com.game.choice_of_action.example.factory.product.AbstractMage;
import com.game.choice_of_action.example.factory.product.Mage;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@DiscriminatorValue("HUMAN_MAGE")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class HumanMage extends AbstractMage implements Mage {

  private int hp = 80;
  private int hit = 50;
  private int strength = 8;
  private int agility = 7;
  private int armor = 8;

  @Override
  public void cast() {
    System.out.println("Human mage cast spell");
  }

  @Override
  public void damage(int value) {
    super.damage(value);
  }

  @Override
  public void upgrade(Mage mage) {
    super.upgrade(mage);
  }

  @Override
  public void skills(boolean levelUp, Mage mage) {
    super.skills(levelUp, mage);
  }

  @Override
  public boolean isAlive() {
    return super.isAlive();
  }
}
