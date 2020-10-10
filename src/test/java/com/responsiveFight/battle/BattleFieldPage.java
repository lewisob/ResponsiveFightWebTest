package com.responsiveFight.battle;

import org.openqa.selenium.By;

public class BattleFieldPage {

  // The below is super flakey, it makes an assumption that the correct answer is always the first one.
  // Answer 1 is always the correct answer for the first 3 questions
  static By CORRECT_ANSWER_BUTTON = By.cssSelector("a[id*='_1']");
  static By INCORRECT_ANSWER_BUTTON = By.cssSelector("a[id*='_2']");
  static By START_BUTTON = By.className("btn-primary");
  static By INTRO_MODAL = By.cssSelector("a[id*='intro_modal']");
}
