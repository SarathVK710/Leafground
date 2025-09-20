Feature: Verify the all Leafground elements

  @AlertSimpleDialog
  Scenario:
    Given select the browser option
    When Alert option
    Then select Alert for Simple Dialog button
    And click alert model OK button
    Then get the text

  @Drag&Drop
  Scenario:
    Given select the broswer option
    When select Drag option
    Then user drag and drop the droppable
    And after drag should get the text and background colour

  @TableGetValue
  Scenario: Get the customer name and country
    Given select the table option
    When click table option
    Then extract the name on the Customer Analytics Table
    And extract the country on the Customer Analytics Table
    Then Validate the customer name and customer country

    @ExcelImport
    Scenario: Search country name and get results
      Given select the table option on the slider bar
      When click table option on the menu
      Then click search option and enter the value
      And extract the results

    @Waits
    Scenario: Validate the wait functionality
      Given select the element option on the slider bar
      When select the Waits option on the menu
      Then click on the visibility section and once visibile get the text
      And click on the invisibility section and confirm button is hide

      @Window
      Scenario: Handle the Window functionality's
        When select the window option on the menu
        Then click the open button and Confirm new Window Opens
        And click the open multiple button and Find the number of opened tabs

