package stepDefinitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.ComponentsPageObject;
import utilities.Utilities;

public class ComponentsStep extends Base {
	ComponentsPageObject components = new ComponentsPageObject();




	@Given("user is on the tek-school retail home page")
	public void user_is_on_the_tek_school_retail_home_page() {
	logger.info("user is on the tek-school retail home page");
	Utilities.screenShot();
	// System.out.println("Inside Step - user is on the tek school retail home page");
	}

	@And("user clicks on the components")
	public void user_clicks_on_the_components() throws InterruptedException {
	components.clickOnConponentsButton();
	logger.info("user clicks on the components");
	// System.out.println("Inside Step - user clicks on components");
	Thread.sleep(2000);
	}



	@When("user scrolls down to show all components")
	public void user_scrolls_down_to_show_all_components() throws InterruptedException {
	components.clickOnShowAllComponents();
	logger.info("user scrolls down to show all components");
	// System.out.println("Inside Step - user scrolls down to show all components");
	Thread.sleep(2000);
	}



	@And("user clicks on mice and trackballs")
	public void user_clicks_on_mice_and_trackballs() throws InterruptedException {
	components.clickOnMiceAndTrackballs();
	logger.info("user clicks on mice and trackballs");
	// System.out.println("Inside Step - user clicks on mice and trackballs");
	Thread.sleep(2000);
	}



	@Then("user click on the continue button")
	public void user_click_on_the_continue_button() throws InterruptedException {
	components.clickOnContinueButton();
	logger.info("user click on the comtinue button");
	// System.out.println("Inside Step - user click on the continue button");
	Thread.sleep(2000);
	}
}
