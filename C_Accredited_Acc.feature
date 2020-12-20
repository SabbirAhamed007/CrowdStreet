Feature: Accredited investor account create feature

  @tag1
  Scenario: Create accredited investor account test scenario
    Given I open crowdstreet website
    And I click on create an account button
    When I enter email
    And First name last name create password referred by
    And I enter phone number street address city
    And Select state zipecode 
    And Select country accredited investor
    And I click on I agree
    And I click I understand 
    And Click on i am not a robot
    Then I click on complete your info
    And Verified congratulations
