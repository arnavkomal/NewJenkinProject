#Author: Vikas Khandekar

@Login_Testing
Feature: Title of your feature
  I want to use this template for my feature file

  @Login_Page_Test
  Scenario: User Will Check Login Activity
    Given User is on OrangeHRM page as "<url>"
    When  User enters username as "<userName>" and password as "<passWord>"
    Then   User will login on main page sucessfully.

  
    Examples: 
      | url  																																						| userName 						    | passWord  					|
      |https://opensource-demo.orangehrmlive.com/        | Admin         						|  admin123       				|