package com.responsiveFight.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

  Covid19GameHomePage covid19GameHomePage;

  private static final String COVID19_THE_GAME = "COVID-19 THE GAME";

  @Step("Open the Covid19 Game home page")
  public void theCovid19GameHomePage() {
    covid19GameHomePage.open();
    covid19GameHomePage.waitForTextToAppear(COVID19_THE_GAME);
  }
}
