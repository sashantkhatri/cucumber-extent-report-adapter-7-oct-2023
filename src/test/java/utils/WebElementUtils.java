package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementUtils extends WebDriverUtils {
	
	public WebElement getElement(By by) {
		return super.driver.findElement(by);
	}
	
	public List<WebElement> getElements(By by) {
		return super.driver.findElements(by);
	}
	
	public void click(By by) {
		getElement(by).click();
	}
	
	public void enterValue(By by, String value) {
		getElement(by).sendKeys(value);
	}
}
