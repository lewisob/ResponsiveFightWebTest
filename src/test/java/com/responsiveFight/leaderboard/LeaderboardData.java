package com.responsiveFight.leaderboard;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class LeaderboardData extends UIInteractionSteps {

  @Step("Look up score")
  public String scoreForUser(String user) {
    List<WebElementFacade> usernames = findAll(LeaderboardPage.USERNAME_FIELD);
    List<WebElementFacade> scores = findAll(LeaderboardPage.SCORE_FIELD);
    String score = null;

    waitForTextToAppear("COVID-19 THE GAME - LEADERBOARD");

    for (int i = 0; i < usernames.size(); i++) {
      if (usernames.get(i).getText().equals(user)) {
        score = scores.get(i).getText();
      }
    }

    return score;
  }
}
