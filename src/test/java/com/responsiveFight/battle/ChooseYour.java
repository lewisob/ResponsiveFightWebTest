package com.responsiveFight.battle;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ChooseYour extends UIInteractionSteps {

  @Step("Choose your battlefield")
  public void battleField(String battleField) {
    // TODO - Use an enum here

    switch (battleField) {
      case "Office":
        $(ChooseBattleFieldPage.OFFICE_BUTTON).click();
        waitForTextToAppear("You have entered the office..");
        break;
      case "Bus":
        $(ChooseBattleFieldPage.TAKE_BUS_BUTTON).click();
        waitForTextToAppear("You have taken the public bus..");
        break;
      case "Restaurant":
        $(ChooseBattleFieldPage.RETAURANT_BUTTON).click();
        waitForTextToAppear("You are seated at a restaurant..");
        break;
      default:
        throw new IllegalArgumentException("Invalid battlefield type: " + battleField);
    }
  }
}
