package com.responsiveFight.warrior;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class CreateWarrior extends UIInteractionSteps {

  @Step("Create warrior")
  public void withName(String warriorName) {
    $(CreateWarriorForm.USERNAME_FIELD).clear();
    $(CreateWarriorForm.USERNAME_FIELD).type(warriorName);
    $(CreateWarriorForm.CREATE_BUTTON).click();
    waitForTextToAppear(warriorName);
    $(CreateWarriorForm.START_JOURNEY_BUTTON).click();
    waitForTextToAppear("Choose your battle field " + warriorName);
  }
}
