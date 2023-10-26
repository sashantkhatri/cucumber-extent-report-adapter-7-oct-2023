package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	LoginPage loginPage = new LoginPage();
	
	@Given("I am on login page")
	
	public void onLoginPage() {
		Assert.assertTrue(loginPage.onLoginPage());
	}
	
	@Then("I should be on login page")
	public void testadad() {
		onLoginPage();
		Assert.assertTrue(false, "This is intentionally failed");
	}
	
	@When("I perform login with {string} and {string}")
	public void performLogin(String username, String password) {
		loginPage.performLogin(username, password);
	}

}
