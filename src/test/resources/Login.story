Narrative:

As a user,
I want to be able to login,
So that I can do some work


Given a connection
And a user Joe with password of abc123
When I login with user Joe and password abc123
Then I should be logged in

Given a connection
And a user Joe with password of abc123
When I login with user Joe and password forgotIt
Then I should get an error message "Life sucks for you..."

Given a connection
And a user Joe with password of abc123
When I login with user Josaphine and password abc123
Then I should get an error message "Who are you??"

Given an invalid connection
And a user Joe with password of abc123
When I login with user Josaphine and password abc123
Then I should get an error message "This wasn't supposed to happen...  Take a lunch and come back and see if the database is back up??"
