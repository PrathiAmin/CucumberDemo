package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,
features = "src/test/resources/features",
glue = {"stepDefinitions"},tags="@FavTest", monochrome=true, plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cucumberJunit.xml"})
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
