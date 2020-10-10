package com.responsiveFight.leaderboard;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://responsivefight.herokuapp.com/leaderboard")
public class LeaderboardPage {

  static By USERNAME_FIELD = By.cssSelector("tbody tr td:nth-child(2)");
  static By SCORE_FIELD = By.cssSelector("tbody tr td:nth-child(3)");
}
