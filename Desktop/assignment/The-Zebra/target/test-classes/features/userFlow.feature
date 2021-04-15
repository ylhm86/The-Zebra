@getQuote

Feature: Get quote for a user

  Scenario: Verify user can get a quote for a car
    When user navigates to home page
    And User set the page "HomePage"
    Then user should see the "The Zebra" title
    And user clicks "labelCarInsurance"
    And user types "78665" to "zipCode"
    And user clicks "getMyQuotes"
    And User set the page "StartPage"
    And user selects "Yes"
    And user selects "I own my home"
    And user selects "I think I’m paying too much"
    And user cliks "saveAndContinue"
    And user types "13030 Northborough Dr" to "garagingAddress"
    And user types "Houston" to "city"
    And user types "Andy" to "firstname"
    And user types "Candy" to "lastname"
    And user types "06231999" to "DOB"
    And user cliks "saveAndContinue"
    And User set the page "VehiclesPage"
    And user writes "2015" to "vehicleYear"
    And user writes "Hyundai" to "vehicleMake"
    And user writes "Genesis" to "vehicleModel"
    And user writes "5.0L 4dr Sedan" to "vehicleSubModel"
    And user cliks "saveAndContinue"
    And user selects "Own—paid in full"
    And user selects "Personal/commuting"
    And user types "200" to "estimatedMlage"
    And user cliks "saveAndContinue"
    And User set the page "DriversPage"
    And user selects "Male"
    And user selects "Single"
    And user selects "Excellent"
    And user selects "Doctoral degree"
    And user selects "More than 3 years"
    And user writes "GEICO" to "currentInsurance"
    And user selects "$50k / $100k"
    And user clicks "clickNo"
    And user types "ylham.sdet@gmail.com" to "email"
    And user clicks "clickNoToSave"
    And user cliks "showMyQuotes"
    And user waits until page loads
    Then user can see the result
