package steps;

import org.junit.Assert;

import com.pages.LoginPage;
import com.pages.Window;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WindowPage {
	
	
private static String text;

	private Window w= new Window(DriverFactory.getDriver());
	
	@Given("User should be on Practice page")
	public void user_should_be_on_practice_page() {
		DriverFactory.getDriver().get("https://rahulshettyacademy.com/AutomationPractice/");
	}
		

	@When("User click on the Open Tab button")
	public void user_click_on_the_open_tab_button() throws InterruptedException {
	w.tab();
	}

		 

	@Then("Page should navigate to the child page")
	public void page_should_contain_the_text() {


	}

	@Then("child page data should be displayed as {string}")
	public void child_page_data_should_be_displayed_as(String Expectedtext) {
		Assert.assertTrue(text.contains(Expectedtext));
	   
}

}


