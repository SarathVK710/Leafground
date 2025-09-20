Feature: Verify for the Spice Jet Web application
  @spice
  Scenario Outline:
    Given user select the From Location "<FromLocation>"
    When user select the To Location "<ToLocation>"
    And user select the Departure Date "<DepartureDate>"
    Then user select the Return Date "<ReturnDate>"
    And Click Search button

    Examples:
    |FromLocation|ToLocation|DepartureDate|ReturnDate|
    |Madurai     |Chennai   |15-05-2025   |16-05-2025|

