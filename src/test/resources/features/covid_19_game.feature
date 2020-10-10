Feature: Covid-19 the game

  Background:
    Given a covid safe user has created a new warrior

  Scenario Outline: Answer questions correctly as a new user
    When she answers <numberQuestions> questions correctly for the <battlefield> battle field
    Then she should be on the leaderboard with <expectedPoints> points

    Examples:
      | numberQuestions | battlefield | expectedPoints |
      | 1               | Office      | 100            |
      | 2               | Bus         | 200            |
      | 3               | Restaurant  | 300            |

    Scenario: Take too long to answer a question
      When he takes too long to answer a question
      Then he can try again