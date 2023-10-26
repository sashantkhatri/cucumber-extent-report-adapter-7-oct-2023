package runners;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.WebDriverUtils;

@CucumberOptions(
		features = { "src/test/resources/features/"},
		dryRun = false,
		glue = {""},
		tags = "",
		plugin = { 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
)
public class TestRunner extends AbstractTestNGCucumberTests {
	WebDriverUtils wdu = new WebDriverUtils();
	private Scenario scenario;

	@Before
	public void init(Scenario scenario) {
		this.scenario = scenario;
		wdu.initializeDriver();
	}
	
	@After
	public void tearDown() {
		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) WebDriverUtils.driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "");
			
		}
		wdu.quitBrwoser();
	}
	
	@AfterStep
	public void afterStep() {
		
	}
}
