package com.responsiveFight.stepDefinitions;

import com.responsiveFight.battle.AnswerQuestions;
import com.responsiveFight.battle.ChooseYour;
import com.responsiveFight.leaderboard.LeaderboardData;
import com.responsiveFight.navigation.NavigateTo;
import com.responsiveFight.warrior.CreateWarrior;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.Random;

import static org.junit.Assert.assertEquals;


public class ResponsiveFightStepDefinitions {

  @Steps
  NavigateTo navigateTo;

  @Steps
  CreateWarrior createWarrior;

  @Steps
  ChooseYour chooseYour;

  @Steps
  AnswerQuestions answerQuestions;

  @Steps
  LeaderboardData leaderboardData;

  private String username;

  @Before
  public void setUsername() {
    Random random = new Random();
    username = "Selenium Test " + random.nextInt(99999999);
  }

  @Given("a covid safe user has created a new warrior")
  public void created_user() {
    navigateTo.theCovid19GameHomePage();
    createWarrior.withName(username);
  }

  @When("she answers (.*) questions correctly for the (.*) battle field")
  public void answers_questions_correctly(int numQuestions, String battleField) {
    chooseYour.battleField(battleField);
    answerQuestions.correctly(numQuestions);
  }

  @When("he takes too long to answer a question")
  public void takes_too_long() {
    chooseYour.battleField("Bus");
    answerQuestions.tooSlowly();
  }

  @Then("she should be on the leaderboard with (.*) points")
  public void should_be_on_leaderboard(String expectedPoints) {
    answerQuestions.finish();
    assertEquals("Points value was not as expected", expectedPoints, leaderboardData.scoreForUser(username));
  }

  @Then("he can try again")
  public void can_try_again() {
    answerQuestions.aSecondTime();
    should_be_on_leaderboard("100");
  }
}
