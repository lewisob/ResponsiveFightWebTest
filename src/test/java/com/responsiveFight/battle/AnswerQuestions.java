package com.responsiveFight.battle;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class AnswerQuestions extends UIInteractionSteps {

  @Step("Answer questions correctly")
  public void correctly(int numQuestions) {
    for (int i = 1; i <= numQuestions; i++) {
      $(BattleFieldPage.START_BUTTON).click();
      $(BattleFieldPage.CORRECT_ANSWER_BUTTON).click();
      $(BattleFieldPage.INTRO_MODAL).waitUntilNotVisible();
      waitForTextToAppear("That is correct!");

      if (i < numQuestions) {
        $(ResultModal.TRY_NEXT_BATTLE_BUTTON).click();
      }
    }
  }

  @Step("Finish answering questions")
  public void finish() {
    $(ResultModal.CHECK_SCORE_BUTTON).click();
  }

  @Step("Take too long to answer")
  public void tooSlowly() {
    int timer = 25;

    $(BattleFieldPage.START_BUTTON).click();
    // Let the question timeout
    try {
      TimeUnit.SECONDS.sleep(timer);
    } catch (InterruptedException e) {
      System.err.format("IOException: %s%n", e);
    }
  }

  @Step("Has a second attempt at answering the question")
  public void aSecondTime() {
    waitForTextToAppear("Time's Up!");
    $(ResultModal.TRY_AGAIN_BUTTON).click();
    $(BattleFieldPage.CORRECT_ANSWER_BUTTON).click();
    $(BattleFieldPage.INTRO_MODAL).waitUntilNotVisible();
    waitForTextToAppear("That is correct!");
  }
}
