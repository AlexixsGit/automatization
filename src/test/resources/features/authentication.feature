Feature: Basic example of authentication

    @Auth1 @Authentication
    Scenario Outline: Successful scenario
    Narrative: A successful user authentication with a correct document and password

    Given Open the svpyme page in the browser
    #When The user authenticates
    #Then Should see the main page

    Examples:
    |documentNumber|password|
    |25130990      |1234    |