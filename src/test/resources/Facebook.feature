Feature:verify the login functionality in fb application
Scenario:valid user name and invalid passsword
Given user in facebook application
When user enter the valid username and password
And user click login button
Then Error page is displayed