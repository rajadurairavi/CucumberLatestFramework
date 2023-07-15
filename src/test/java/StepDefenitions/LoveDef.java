package StepDefenitions;

import CommonFunctions.BaseTest;
import PageObjects.TempPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoveDef extends BaseTest {
	

	public static TempPage page;
	
	@Given("User is exist on Google Page")
	public void user_is_exist_on_google_page() {
	    initialization();
	}


	@When("I Search For Selenium {string}")
	public void i_search_for_selenium(String SearchText) {
	  page = new TempPage();
	  page.enterTextInSearchBox(SearchText);
	}
	@When("I refresh the browser")
	public void i_refresh_the_browser(){
		
	    driver.navigate().refresh();
	}
	@Then("I close the browser")
	public void i_close_the_browser() {
	    driver.quit();
	}

	
	


}
