package utils;

import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverUtils {
	public static WebDriver driver;
	
	public void initializeDriver() {
		String browserName = Config.browser;
		Boolean headless = Config.headless;
		ChromeOptions options = new ChromeOptions();
		if (browserName.equals("chrome")) {
			if (headless) {
				options.addArguments("--headless=new");
			}
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}
		driver.get("https://www.saucedemo.com/?ref=hackernoon.com");
	}
	
	
	public void quitBrwoser() {
		driver.quit();
	}
}
