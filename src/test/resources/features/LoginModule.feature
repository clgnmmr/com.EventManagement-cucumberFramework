@login
Feature:Login module test with user

  Background:join step
    Given User opens "eventUrl" link

  @loginTC001
  Scenario:TC001-User should see login form if not authenticated.
    When User sees username,password and login titles


  @loginTC002
  Scenario:TC002-User should see validation errors if click the login button without fill the login form
    When User should see validation errors

  @loginTC003
  Scenario:TC003–User should navigate to the dashboard
    When User gives "validName" and "validPassword"
    Then User clicks login button and sees message