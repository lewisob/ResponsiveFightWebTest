package com.responsiveFight.battle;

import org.openqa.selenium.By;

public class ResultModal {

  static By TRY_NEXT_BATTLE_BUTTON = By.cssSelector("button[id*='close_']");
  static By CHECK_SCORE_BUTTON = By.id("leaderboard_link");
  static By TRY_AGAIN_BUTTON = By.cssSelector("button[onclick='startProgressBar()']");
}
