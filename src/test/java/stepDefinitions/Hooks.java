package stepDefinitions;

import Cucumber.Automation.Base;
import io.cucumber.java.After;

public class Hooks extends Base {
	@After("@FavTest")
	public void afterFavTest(){
		System.out.println("Closing the driver");
		driver.close();
		
	}
	
	@After("@NotSoFavTest")
	public void afterNotSoFavTest(){
		System.out.println("Closing the driver");
		driver.close();
		
	}

}
