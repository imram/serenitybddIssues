Feature: Checking Eligibility
  In order to get Card Credit Offers Online,
  As a Credit Card Holder,
  I want to be able to check offers eligibility so that I can accept one or more offer online

  Scenario: Checking CrossSell Eligibility within Retention window
    Given CardHolder with following accountinfo wants to eligibility online
      | FirstName | LastName | Credit Score | AccountStatus | State |
      | John      | Smith    | 650          | CURRENT       | VA    |
    When CardHolder checks eligibility online
    Then CardHolder should be able to see CreditLimitIncrease as eligible offer types
    Then CardHolder should be able to see following link to apply for offer
      | OfferLink                |
      | https://abc.html         |