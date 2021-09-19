package com.game.choice_of_action.example.dwarf;

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
@DiscriminatorValue("DWARF_MAGE")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class DwarfMage extends AbstractMage implements Mage {

  private int hp = 70;
  private int hit = 50;
  private int strength = 7;
  private int agility = 5;
  private int armor = 10;

  @Override
  public void cast() {
    System.out.println("Dwarf mage cast spell");
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
