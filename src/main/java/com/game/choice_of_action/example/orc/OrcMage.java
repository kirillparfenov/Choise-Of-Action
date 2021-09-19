package com.game.choice_of_action.example.orc;

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
@DiscriminatorValue("ORC_MAGE")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class OrcMage extends AbstractMage implements Mage {

  private int hp = 100;
  private int hit = 30;
  private int strength = 10;
  private int agility = 3;
  private int armor = 6;

  @Override
  public void cast() {
    System.out.println("Orc mage cast spell");
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
