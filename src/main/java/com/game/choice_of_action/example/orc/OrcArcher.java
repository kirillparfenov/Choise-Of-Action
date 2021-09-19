package com.game.choice_of_action.example.orc;

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
@DiscriminatorValue("ORC_ARCHER")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class OrcArcher extends AbstractArcher implements Archer {

  private int hp = 120;
  private int hit = 50;
  private int strength = 10;
  private int agility = 3;
  private int armor = 6;

  @Override
  public void shoot() {
    System.out.println("Orc archer shoot");
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
