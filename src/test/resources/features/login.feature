#Author: Sashant Khatri<sashan4u007@gmail.com>
@Login
Feature: Verify Login Functionality
  I want to use this template for verify login functionality with different set of data
	
	Background:
		Given I am on login page
				
  @Regression
  Scenario Outline: Verify Login with valid credentials
    When I perform login with "<username>" and "<password>"
    Then I should be on inventory page

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |

	@Regression
  Scenario: Verify Login with invalid credentials
    When I perform login with "invalid_user" and "invalid_password"
    Then I should be on login page
