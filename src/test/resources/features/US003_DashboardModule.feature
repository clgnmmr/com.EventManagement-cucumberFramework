@regression @dashboard
Feature: Dashboard module test with user

  Background: join step
    Given User opens "eventUrl" link
    When User gives "validName" and "validPassword"
    Then User clicks login button and sees message

  @dashboardTC001
  Scenario: TC001-User should view dashboard if authenticated
    Then  User views dashboard if authenticated

  @dashboardTC002
  Scenario: TC002-User should redirect to login page if not authenticated

  @dashboardTC003
  Scenario: TC003-User should view list of events if any event created otherwise user should view notification message states no registered event found
    Then  User views dashboard if authenticated
    And User views Events list or error message

  @dashboardTC004
  Scenario: TC004-User should be able navigate edit event when click the edit event button
    And User clicks the Create Event button
    Then User fills out the form and sees the message Successfully created.
    And User clicks edit Event button
    And User checks that the edit page is opened.

  @dashboardTC005
  Scenario: TC005-User should be able to delete event when click the delete button
    Then User clicks the create event button and fills out the form
    And User clicks delete button

  @dashboardTC006
  Scenario: TC006-User should be able to view event participants
    Then User clicks the create event button and fills out the form
    And User clicks participants button