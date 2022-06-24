
package stepDefinitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.LaptopsNoteBooksPageObject;

public class LaptopsNoteBooksStep extends Base {
	LaptopsNoteBooksPageObject laptopsNoteBooks = new LaptopsNoteBooksPageObject();
	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws InterruptedException {
	logger.info("user is on retail website");
	Thread.sleep(2000);
	} @When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws InterruptedException {
	laptopsNoteBooks.clickOnLaptopNoteBookTab();
	logger.info("user click on laptop & notebook tab");
	Thread.sleep(2000);
	} @And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws InterruptedException {
	laptopsNoteBooks.clickOnShowAllLaptopNoteBook();
	logger.info("user click on show all laptop & notebook option");
	Thread.sleep(2000);
	} @And("User click on MacBook item")
	public void user_click_on_mac_book_item() throws InterruptedException {
	laptopsNoteBooks.clickOnMacBookItem();
	logger.info("user click on macbook item");
	Thread.sleep(2000);
	}
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() throws InterruptedException {
	laptopsNoteBooks.clickAddToCartButton();
	logger.info("user click add to cart button");
	Thread.sleep(2000);
	} @Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() throws InterruptedException {
	laptopsNoteBooks.shouldSeeSuccessAddedMessage();
	logger.info("user should see a message success: you have added macbook to your shopping cart!");
	Thread.sleep(2000);
	} @And("User should see ‘{int} tem\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) throws InterruptedException {
	laptopsNoteBooks.shouldSeeItemShowedToCart();
	logger.info("user should see item showed to the cart");
	Thread.sleep(2000);
	} @And("User click on cart option")
	public void user_click_on_cart_option() throws InterruptedException {
	laptopsNoteBooks.clickOnCartOption();
	logger.info("user click on cart option");
	Thread.sleep(2000);
	} @And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws InterruptedException {
	laptopsNoteBooks.clickOnRedXButton();
	logger.info("user click on red x button to remove the item form cart");
	Thread.sleep(2000);
	} @Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) throws InterruptedException {
	laptopsNoteBooks.itemShouldBeRemoved();
	logger.info("item should be removed and cart should show");
	Thread.sleep(2000);
	}
	@And("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
	laptopsNoteBooks.clickOnProductComparisonIconMacBook();
	logger.info("user click on product comparison icon macbook");
	Thread.sleep(2000);
	} @And("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
	laptopsNoteBooks.clickOnProductComparisonIconMacBookAir();
	logger.info("user click on product comparison icon on macbook air");
	Thread.sleep(2000);
	} @And("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() throws InterruptedException {
	laptopsNoteBooks.shouldSeeMessageSuccessAddedMacbookAirToProductComparison();
	logger.info("user should see a message success you have added macbook air to your product compariosn");
	Thread.sleep(2000);
	} @And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
	laptopsNoteBooks.clickOnProductComparisonLink();
	logger.info("user click on product comparison link");
	Thread.sleep(2000);
	} @And("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws InterruptedException {
	laptopsNoteBooks.shouldSeeProductComparisonChart();
	logger.info("user should see product comparison chart");
	Thread.sleep(2000);
	} @And("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() throws InterruptedException {
	laptopsNoteBooks.clickOnHeartIconToAddSonyToWishList();
	logger.info("user click on heart icon to add sony vaio laptop to wish list");
	Thread.sleep(2000);
	} @Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws InterruptedException {
	laptopsNoteBooks.shouldSeeMessageMustLoginOrCreateAnAccount();
	logger.info("user should get a message you must login or create an account to save sony vaio to your wish list");
	Thread.sleep(2000);
	} @And("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() throws InterruptedException {
	laptopsNoteBooks.clickOnMacBookProItem();
	logger.info("user click on macbook pro item");
	Thread.sleep(2000);
	} @Then("User should see ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) throws InterruptedException {
	laptopsNoteBooks.shouldSeePriceTag();
	logger.info("user should see price tag is presnt on ui");
	Thread.sleep(2000);
	}


}
