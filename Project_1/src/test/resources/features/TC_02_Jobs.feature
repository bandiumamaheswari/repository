Feature: I am automating orangeHRM Application

Background: Common Re-usable steps
Given user launch chrome browser
Then user opens URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario Outline: TC01_AddJobs record- creating jobs record
And user enters username as "Admin" and password as "admin123"
Then go to jobs page 
When user enters jobname as <JobName>  and job description as <JobDesc>
Then user clicks logout button
Then close the browser



Examples: 
|JobName      |JobDesc           |
|"Cucumber121"|"Cucumber121 desc"|
|"Cucumber122"|"Cucumber122 desc"|
|"Cucumber123"|"Cucumber123 desc"|