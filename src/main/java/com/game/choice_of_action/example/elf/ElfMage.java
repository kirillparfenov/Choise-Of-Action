package com.game.choice_of_action.example.elf;

import com.game.choice_of_action.example.factory.product.AbstractMage;
import com.game.choice_of_action.example.factory.product.Mage;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("ELF_MAGE")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class ElfMage extends AbstractMage implements Mage {

  private int hp = 60;
  private int hit = 40;
  private int strength = 5;
  private int agility = 10;
  private int armor = 5;

  @Override
  public void cast() {
    System.out.println("Elf mage cast spell");
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
