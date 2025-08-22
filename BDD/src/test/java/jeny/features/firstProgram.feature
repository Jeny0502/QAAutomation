
Feature:  Application Login.
To verfiy the login functionality to the app.

Background:
Given user info is available in the database
When system variable is set to true
And user login page is available


@RegressionTest @Admin
Scenario: Successful login to the app by Admin
Given Customer lands in the login page
When user enters the jake@gmail.com and pASSWORD
Then customer logged in successfully

@Customer
Scenario: Successful login to the app by Customer
Given Customer lands in the login page
When user enters the jeny5anna@gmail.com and sELENIUMaUTOMATION5*
Then customer logged in successfully

@SmokeTest
Scenario Outline: Login to the application is blokced while using invalid user credential
Given Customer lands in the login page
When user enters the <username> and <password>
Then user not logged in successfully
Examples:
|username 		| password|
|jeny			|jskdas   |
|jdjfds			| eferf3  |
|sdfsdf			|3245vf   |

@SmokeTest @RegressionTest
Scenario: Sign up by new user
Given User is on practice landing page
When User sign up into application
|sam|
|jake|
|samjake3454@gmail.com|
|8239433334|
Then Home page is displayed
And Cards are displayed


