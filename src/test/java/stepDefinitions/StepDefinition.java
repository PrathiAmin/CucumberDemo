package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

@RunWith(Cucumber.class)
public class StepDefinition extends Base {

	LandingPage lp;
	LoginPage loginPage;

	@Given("^User is on the landing page$")
	public void user_is_on_the_landing_page() throws Throwable {
		driver = Base.getDriver();
	}

	@When("^User clicks on the Login option and enters valid (.+) and (.+)$")
	public void user_clicks_on_the_login_option_and_enters_valid_and(String username, String password)
			throws Throwable {

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// System.out.println(username +" " + password);
		lp = new LandingPage(driver);
		lp.getMyAccount().click();
		lp.getLogin().click();
		loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys(username);
		loginPage.getPassword().sendKeys(password);
		loginPage.clickLogin().click();

	}

	@Then("^HomePage is displayed with \"([^\"]*)\"$")
	public void homepage_is_displayed_with_something(String list1) throws Throwable {

		Thread.sleep(2000);
		String hiUser = driver.findElement(By.xpath("//div/h3[@class='text-align-left']")).getText();
		if (hiUser.equalsIgnoreCase(list1)) {
			System.out.println("Homepage is displayed");
		}
	}

	@When("^User clicks on the Login option and enters a valid (.+) and invalid (.+)$")
	public void user_clicks_on_the_login_option_and_enters_valid_and_invalid(String username, String password)
			throws Throwable {
		System.out.println(username + "   " + password);
	}

	@Then("^HomePage is not displayed$")
	public void homepage_is_not_displayed() throws Throwable {
		System.out.println("HomePage is not displayed");
	}

}
