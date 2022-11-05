Feature: Put Request

Scenario: User able to put the data into database
Given User want to pass the data into database
When User wantto pass the data by using URI "http://localhost:8080/hospital/branch/3"
Then User want to validate the statusline "HTTP/1.1 200 "
And User want to status code 200


