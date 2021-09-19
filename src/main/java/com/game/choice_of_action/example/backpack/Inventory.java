package com.game.choice_of_action.example.backpack;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Data;

@Data
public class Inventory {

  private final Equipment equipment;

  private final Container container;


  @Min(0)
  @Max(50)
  private Long weight;

  //TODO Inventory inventory = new Inventory(10); Player player = new Player(inventory);
}
