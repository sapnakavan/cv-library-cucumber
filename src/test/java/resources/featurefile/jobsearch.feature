Feature: Job Search
 As User I want to Search Jobs into CVlibrary website

  Scenario Outline: :Verify Jobsearch Reasult using differentDataSet
    Given I am on Home Page
    When   I enter job title "<jobTitle>"
    And   I enter location "<location>"
    And   I select distance "<distance>"
    And   I click on more Serch options Link
    And   I enter salarymin "<salaryMin>"
    And   I enter salaryMax "<salaryMax>"
    And   I select salry type "<salaryType>"
    And   I select Job type "<jobType>"
    And   I click on find jobs button
    Then  I verify the result "<result>"

    Examples:
      |jobTitle |location | distance |salaryMin |salaryMax |salaryType |jobType |result |
      |Tester |Harrow | up to 5 miles |30000 |50000 |Per annum | Permanent |Permanent Tester jobs in Harrow on the Hill|
      |Retail manager |wembley | up to 7 miles |20000 |60000 |Per annum | Contract |Contract Retail Manager jobs in Wembley|
      |Devloper |Camden Town | up to 10 miles |25000 |45000 |Per annum | Part Time |Part Time Developer jobs in Camden Town|
      |Java Developer |Mayfair | up to 5 miles |30000 |80000 |Per annum | Permanent |Permanent Java Developer jobs in Mayfair|
      |Retail Team Leader |Nottingham | up to 15 miles |35000 |70000 |Per annum | Temporary |Temporary Retail Team Leader jobs in Nottingham|
      |Project Management |Oxfordshire | up to 7 miles |20000 |75000 |Per annum | Permanent |Permanent Project Management jobs in Oxfordshire|
      |Administrator |London | up to 10 miles |25000 |90000 |Per annum | Contract |Contract Administrator jobs in London|