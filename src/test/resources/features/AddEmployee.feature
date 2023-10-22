Feature: add employee scenario

  Background:
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

  @addemp @test
  Scenario: Adding one employee in the hrms system
    #Given user is navigated to HRMS application
    #When user enters admin username and password
    #And user clicks on login button
    #Then user is successfully logged in
    #When user clicks on PIM option
    #And user clicks on add employee option
    When user enters firstName middleName and lastName
    And user clicks on save button
    Then employee added successfully
    #Then user closes the browser

  @cucumber
  Scenario: Adding one employee using the feature file
    #Given user is navigated to HRMS application
    #When user enters admin username and password
    #And user clicks on login button
    #Then user is successfully logged in
    #When user clicks on PIM option
    #And user clicks on add employee option
    When user enters "Uzair" and "Uddin" and "Babar"
    And user clicks on save button
    Then employee added successfully
    #Then user closes the browser

  @ddt
  Scenario Outline:
    When user enters "<firstName>" and "<middleName>" and "<lastName>"
    And user clicks on save button
    Then employee added successfully
    Examples:
      | firstName | middleName | lastName |
      | kiran     | nas        | sadiq    |
      | aiyla     | nas        | babar    |
      | dua       | nas        | babar    |

  @excel
  Scenario: Adding multiple employees from excel file
    When user adds multiple employees from excel using "Sheet1" and verify them

  @datatable
  Scenario: Adding multiple employees from data table
      When user adds multiple employees from data table
        | firstName | middleName | lastName |
        | kiran1    | nas        | sadiq    |
        | aiyla1    | nas        | babar    |
        | dua1      | nas        | babar    |



