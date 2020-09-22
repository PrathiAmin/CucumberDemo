Feature: Application Login
@FavTest
Scenario Outline: Home page  valid Login
	Given User is on the landing page
	When User clicks on the Login option and enters valid <username> and <password>
	Then HomePage is displayed with "Hi, Demo User"
Examples:
| username            | password |
| user@phptravels.com | demouser |

@NotSoFavTest
Scenario Outline: Home page  invalid Login
	Given User is on the landing page
	When User clicks on the Login option and enters a valid <username> and invalid <password>
	Then HomePage is not displayed
Examples:
| username            | password |
| user@phptravels.com | demo123 |