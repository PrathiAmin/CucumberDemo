package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public WebDriver driver;
	// By signin = By.id("dropdownCurrency");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By email = By.xpath("//input[@name='username']");

	public WebElement getEmail() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		return driver.findElement(email);
	}

	By password = By.xpath("//input[@name='password']");

	public WebElement getPassword() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		return driver.findElement(password);

	}

	By login = By.xpath("//*[@id='loginfrm']/button");

	public WebElement clickLogin() {
		return driver.findElement(login);
	}

	By loginheader = By.xpath("//div[@class='d-flex flex-column h-100']/h3");

	public WebElement getLoginPageHeader() {
		return driver.findElement(loginheader);
	}
}
