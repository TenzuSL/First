Feature: SIP calculator


@Smoketest
Scenario: home page
    Given user is in the poorvika reg page
     When user enters details
     | ram | Sita | df@gmail.com | 9854795621 | 04785 24578 | 1000 |
     Then the home page is displayed

@Regtest
Scenario Outline: SIP calculation
    Given user is in sip calculator page
     When user enters <Amount> <period> <Returns>
     Then verify the calculated SIP result
  

    Examples:
    
    |Amount|period|Returns| 
    |500000|5|10|
    |1000000|10|12|
    |1500000|15|15|
  
  
