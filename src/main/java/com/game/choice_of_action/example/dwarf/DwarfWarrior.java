package com.game.choice_of_action.example.dwarf;

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
@DiscriminatorValue("DWARF_WARRIOR")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class DwarfWarrior extends AbstractWarrior implements Warrior {

  private int hp = 200;
  private int hit = 60;
  private int strength = 7;
  private int agility = 5;
  private int armor = 10;

  @Override
  public void attack() {
    System.out.println("Dwarf warrior attack");
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
