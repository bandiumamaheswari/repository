Feature: I am automating orangeHRM Application

Background: Common Re-usable steps
Given user launch chrome browser
Then user opens URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario: TC01_AddSkills record- creating skills record
And user enters username as "Admin" and password as "admin123"
Then go to skills page 
When user enters skillname as "Selenium126" and skill description as "Selenium126 desc"
Then user clicks logout button
Then close the browser
