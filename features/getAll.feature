Feature:
getAll Request

Scenario: User want to read the data into database
When  User want to fetch the data from database "http://localhost:8080/hospital/branch"
Then User want to verify that status line "HTTP/1.1 200 "
And User want to verify the status code 200