package com.game.choice_of_action.example.elf;

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
@DiscriminatorValue("ELF_WARRIOR")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class ElfWarrior extends AbstractWarrior implements Warrior {

  private int hp = 180;
  private int hit = 50;
  private int strength = 5;
  private int agility = 10;
  private int armor = 5;

  @Override
  public void attack() {
    System.out.println("Elf warrior attack");
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
