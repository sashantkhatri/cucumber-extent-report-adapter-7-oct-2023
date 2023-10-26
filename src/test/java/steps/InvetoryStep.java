package steps;

import io.cucumber.java.en.Then;
import pages.Common;

public class InvetoryStep extends Common {
	
	@Then(value = "I should be on inventory page")
	public void onInventoryPage() {
		System.out.println("On Invetory Page");
	}
}
