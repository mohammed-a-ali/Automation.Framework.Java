Feature: User Registration
  I want to check that the user can register in our ECommerce website

  Scenario: User Registration
    Given the user in the home page
    When I click on register link
    And I entered the user data
    Then The registration page displays successfully

  Scenario Outline: User Registration
    Given the user in the home page
    When I click on register link
    And I entered "<firstName>", "<lastName>", "<email>", "<password>"
    Then The registration page displays successfully
    Examples:
      | firstName | lastName | email            | password |
      | Mohamed   | Ali      | malii5@gmail.com | 123456789 |
      | Ahmed     | Khaled   | akt5@gmail.com   | 123456789 |

