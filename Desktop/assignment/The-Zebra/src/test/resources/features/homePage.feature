@homePage
Feature: All Home page headers
  As user I want to be able to see all headers as a table

  Scenario: Verify elements on the home page
    When user navigates to home page
    Then verify the "Compare top providers & find your perfect policy." title
    Then verify the "Compare" insurances
    Then verify the "Tools & Tips" tools
    Then verify the "Company" button
