package stepDefinitions;

import java.util.List;

import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.DesktopPageObject;
import utilities.Utilities;

public class DesktopStep extends Base {
	
	DesktopPageObject desktop = new DesktopPageObject();
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() throws InterruptedException {
	desktop.clickOnDesktop();
	logger.info("user click on desktops tab");
	Thread.sleep(2000);
	} @And("User click on Show all desktops")
	public void user_clik_on_show_all_desktops() throws InterruptedException {
	desktop.clickOnShowAllDesktop();
	logger.info("user click on show all desktops");
	Thread.sleep(2000);
	} @Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws InterruptedException {
	desktop.desktopPage();
	// Assert.assertTrue(desktop.isAllItemsShowing());
	// Assert.assertFalse(desktop.verifyUIElementsOnDesktopsPage());
	logger.info("user should see all items are present in desktop page");
	Utilities.screenShot();
	Thread.sleep(2000);
	}
	@And("User click ADD TO CART option on 'HP LP3065' item")
	public void user_click_add_to_cart_option_on_hp_item() throws InterruptedException {
	desktop.clickOnAddToCartHP();
	logger.info("user click add to cart option on HPLP3065 item");
	Thread.sleep(2000);
	}
	@And("User click ADD TO CART option on 'Canon EOS 5D' item")
	public void user_click_add_to_cart_option_on_canon_item() throws InterruptedException {
	desktop.clickOnAddToCartCanon();
	logger.info("user click add to cart option on canon eos 5d item");
	Thread.sleep(2000);
	}
	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() throws InterruptedException {
	desktop.clickOnReviewLink();
	logger.info("user click on write a review link");
	Thread.sleep(2000);
	}
	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	desktop.enterYourName(data.get(0).get("yourName"));
	desktop.enterYourReview(data.get(0).get("yourReview"));
	desktop.enterRating(data.get(0).get("rating"));
	logger.info("user fill the review information with below information");
	
	} 
	@Then("User should see a message")
	public void user_should_see_a_message() throws InterruptedException {
	desktop.shouldSeeAMessage();
	logger.info("user should see a message");
	Thread.sleep(2000);
	}
	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) throws InterruptedException {
	desktop.selectQuantity();
	logger.info("user select quantity");
	Thread.sleep(2000);
	} @And("User click ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() throws InterruptedException {
	desktop.clickOnAddToCartLaptop();
	logger.info("user click add to cart option on HP LP3065 item");
	Thread.sleep(2000);
	} @Then("User should see a message ‘Success: you have added HP LP to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart() throws InterruptedException {
	desktop.shouldSeeAMessageLapTop();
	logger.info("user should see a message 'success you have added hp lp to your shopping cart!'");
	Thread.sleep(2000);
	} @And("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() throws InterruptedException {
	desktop.clickAddToCartCanonE();
	logger.info("user click add to cart option on canon eos 5d item");
	Thread.sleep(2000);
	
	} @And("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() throws InterruptedException {
	desktop.selectColorDropDown();
	logger.info("user select color from dropdown Red");
	Thread.sleep(2000);
	
	} @Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() throws InterruptedException {
	desktop.shouldSeeAMessageCanonCart();
	logger.info("user should see a message success you have added canon eos 5d to your shopping cart");
	Thread.sleep(2000);
	} @And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() throws InterruptedException {
	desktop.clickOnCanonItem();
	logger.info("user click on canon eos 5d item");
	Thread.sleep(2000);
	} @And("User click on Continue Button")
	public void user_click_on_continue_button() throws InterruptedException {
	desktop.clickOnContinueButton();
	logger.info("user click on continue button");
	Thread.sleep(2000);
	} @Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() throws InterruptedException {
	desktop.shouldSeeAReviewMessage();
	Assert.assertTrue(desktop.isReviewSuccessMessagePresent());
	logger.info("user should see a message with thank you for your review it has been submitted to the webmaster for approval");
	Utilities.screenShot();
	Thread.sleep(2000);
	}


}
