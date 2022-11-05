
Feature: get BranchId Request

Scenario: User want to read data of branch from database by using id
When User want to fetch data  of branch from database by using id "http://localhost:8080/hospital/branch/2"
Then User want to verify statusline "HTTP/1.1 200 " of branchid
And User want to verify status code 200 of branchid
