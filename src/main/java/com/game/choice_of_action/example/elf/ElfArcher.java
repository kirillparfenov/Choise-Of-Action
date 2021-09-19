package com.game.choice_of_action.example.elf;

import com.game.choice_of_action.example.factory.product.AbstractArcher;
import com.game.choice_of_action.example.factory.product.Archer;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@DiscriminatorValue("ELF_ARCHER")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class ElfArcher extends AbstractArcher implements Archer {

  private int hp = 80;
  private int hit = 30;
  private int strength = 5;
  private int agility = 10;
  private int armor = 5;

  @Override
  public void shoot() {
    System.out.println("Elf archer shoot");
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
