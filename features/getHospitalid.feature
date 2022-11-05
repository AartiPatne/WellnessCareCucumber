
Feature: get Hospitalid Request

Scenario: User want to read data of hospital from database by using id
When User want to fetch the data of hospital from database by using id "http://localhost:8080/hospital/3/branch"
Then User want to verify the statusline "HTTP/1.1 200 " of hospitalid
And User want to verify the status code 200 of hospitalid

