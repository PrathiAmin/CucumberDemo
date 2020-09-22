package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	// By signin = By.id("dropdownCurrency");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//By myAccount = By.xpath("(//*[@id='dropdownCurrency'])[2]");
	/*public WebElement getMyAccount() {
		return driver.findElement(myAccount);

	}*/

	@FindBy(xpath="(//*[@id='dropdownCurrency'])[2]")
	WebElement myAccount;
	
	public WebElement getMyAccount() {
		return myAccount;

	}

	@FindBy(xpath="//a[text()='Login']")
	WebElement login;

	public WebElement getLogin() {
		return login;

	}

	// By logo =
	// By.xpath("//a/img[@src='https://www.phptravels.net/uploads/global/logo.png']");

	/*
	 * By logo = By.cssSelector(
	 * "img[src='https://www.phptravels.net/uploads/global/logo.png']"); public
	 * WebElement getLogo(){ return driver.findElement(logo); }
	 */

	// By navbar = By.xpath("//div[@class='navbar navbar-expand-lg']");
	By navbar = By.cssSelector("div[class='navbar navbar-expand-lg']");

	public WebElement getNavBar() {
		return driver.findElement(navbar);
	}

}
