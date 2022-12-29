@regression @event
Feature:Event module test with user
  Background:join step
    Given User opens "eventUrl" link
    When User gives "validName" and "validPassword"
    Then User clicks login button and sees message
    And User clicks the Create Event button

  @eventTC001
  Scenario:TC001-User should view create event form if click the Create Event button on dashboard
    When User sees the Create Event title

  @eventTC002
  Scenario:TC002-User should view validation errors if click the Create Event button without fill the event form
    Then User views validation errors if click the Create Event button

  @eventTC003
  Scenario:TC003–User should be able to add new participant when click the Add Participant button

    Then User adds new participant when clicks the Add Participant button

  @eventTC004
  Scenario:TC004-User should view error message if removes all participants
    Then User views error messages if removes all participants

  @eventTC005
  Scenario:TC005-User should be able to create new event if fills all required fields and redirect to dashboard page with create successful message
    Then User fills out the form and sees the message Successfully created.

  @eventTC006
  Scenario:TC006-User should be able to edit event. When user click the edit button all event fields must be filled according to editing event
    Then User fills out the form and sees the message Successfully created.
    And User clicks edit Event button
    And User checks that the edit page is opened.

  @eventTC007
  Scenario:TC007-User should be able to update event if required fields filled and redirect to dashboard page with update successful message
    Then User fills out the form and sees the message Successfully created.
    And User clicks edit Event button
    And User fills in the required fields and sees the update successful message