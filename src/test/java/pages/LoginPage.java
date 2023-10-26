package pages;

import org.openqa.selenium.By;

public class LoginPage extends Common {
	
	By usernameTxtbox = By.id("user-name");
	By passwordTxtbox = By.id("password");
	By loginBtn = By.id("login-button");
	
	public void performLogin(String username, String password) {
		enterValue(usernameTxtbox, username);
		enterValue(passwordTxtbox, password);
		click(loginBtn);
	}
	
	public boolean onLoginPage() {
		return getElement(usernameTxtbox).isDisplayed() &&
				getElement(passwordTxtbox).isDisplayed() &&
				getElement(loginBtn).isDisplayed();
	}

}
