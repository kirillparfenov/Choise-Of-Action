package com.game.choice_of_action.example.dwarf;

import com.game.choice_of_action.example.factory.product.AbstractArcher;
import com.game.choice_of_action.example.factory.product.Archer;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("DWARF_ARCHER")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class DwarfArcher extends AbstractArcher implements Archer {

  private int hp = 90;
  private int hit = 20;
  private int strength = 7;
  private int agility = 5;
  private int armor = 10;

  @Override
  public void shoot() {
    System.out.println("Dwarf archer shoot");
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
