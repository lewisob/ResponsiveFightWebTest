# BDD Selenium project for Covid-19 game

I have used [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html) for this framework.
It reduces the time and cost involved in building a framework as it comes bundled with Selenium and Cucumber.

Beautiful test reports are also produced as part of the library.

## Framework structure
The framework generally follows a traditional POM approach:
- Feature files
- Step definitions
- Action classes
- Page objects

The imperative-style action classes make the code more readable and works well in a BDD framework.
```java
@Given("a covid safe user has created a new warrior")
  public void created_user() {
    navigateTo.theCovid19GameHomePage();
    createWarrior.withName(username);
  }
```

## Prerequisites
* Install Java 1.8
* Install Maven

## Configure
I have included the latest drivers for chrome on mac and windows only.
The project has only been tested on mac.

By default the tests will run in headless mode. But this can be changed in the `serenity.conf` file:
```java
headless.mode = false
```

## How to run tests
```bash
mvn clean verify
```
You can also run the `.feature file` or run the `ResponsiveFightTests.java` file

## Test results
The Serenity html report can be found at `/target/site/serenity/index.html`.
It is configured to take a screenshot only on failures.