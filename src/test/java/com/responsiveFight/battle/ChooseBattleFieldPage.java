package com.responsiveFight.battle;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://responsivefight.herokuapp.com/covid")
public class ChooseBattleFieldPage {

  static By TAKE_BUS_BUTTON = By.id("bus");
  static By RETAURANT_BUTTON = By.id("restaurant");
  static By OFFICE_BUTTON = By.id("office");
}
