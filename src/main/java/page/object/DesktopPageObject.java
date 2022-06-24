package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement quantity;

		@FindBy(xpath = "//body")
		private WebElement body;

		@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
		private WebElement textToValildate;

		@FindBy(xpath = "//a[text()='Show All Desktops']")
		private WebElement showAllDesktop;

		@FindBy(xpath = "//a[text()='Desktops']")
		private WebElement desktopTab;

		@FindBy(xpath = "//a[contains(text(),'Apple Cinema 30\"')]")
		private WebElement desktopGoods;

		@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
		private WebElement canonEOS;

		@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
		private WebElement laptopHP;

		@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
		private WebElement touchHd;

		@FindBy(xpath = "//a[contains(text(),'iPhone')]")
		private WebElement iPhone;

		@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
		private WebElement iPad;

		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[7]/div[1]/div[2]/div[1]/h4[1]/a[1]")
		private WebElement macBook;

		@FindBy(xpath = "//a[contains(text(),'MacBook Air')]")
		private WebElement macBookAir;

		@FindBy(xpath = "//a[contains(text(),'Palm Treo Pro')]")
		private WebElement palmPro;

		@FindBy(xpath = "//a[contains(text(),'Product 8')]")
		private WebElement product;

		@FindBy(xpath = "//a[contains(text(),'Samsung SyncMaster 941BW')]")
		private WebElement samsungMaster;

		@FindBy(xpath = "//a[contains(text(),'Sony VAIO')]")
		private WebElement sony;

		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement addToCartButton;

		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
		private WebElement addToCart;

		@FindBy(css = "div.container:nth-child(4) div.row div.col-sm-12 div.row:nth-child(1) div.col-sm-4 div.btn-group:nth-child(1) > button.btn.btn-default:nth-child(1)")
		private WebElement addToWishList;

		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[3]")
		private WebElement compareThisProductButton;

		@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
		private WebElement messageText;

		@FindBy(xpath = "//input[@id='input-name']")
		private WebElement nameField;

		@FindBy(xpath = "//textarea[@id='input-review']")
		private WebElement reviewField;

		@FindBy(xpath = "//input[@value='5']")
		private WebElement ratingBox;

		@FindBy(xpath = "//a[contains(text(),'Write a review')]")
		private WebElement writeReview;

		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
		private WebElement addToCartLapTopHP;

		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]")
		private WebElement addToCartButtonCanonEOS;

		@FindBy(xpath = "//option[contains(text(),'Red')]")
		private WebElement redOption;

		@FindBy(xpath = "//button[@id='button-review']")
		private WebElement continueButton;

		@FindBy(xpath = "//div[text()=' Thank you for your review. It has been submitted to the webmaster for approval.']")
		private WebElement aReviewMessage;

		public void validateHomePage() {
		String text = textToValildate.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
		logger.info("Text verified!");
		}else {
		logger.info("Text does not match!");
		}



		}
		public void clickOnDesktop() {
		desktopTab.click();
		}
		public void clickOnShowAllDesktop() {
		showAllDesktop.click();
		}
		public void desktopPage() {
		body.isDisplayed();
		}
		public void clickOnAddToCart() {
		addToCart.click();
		}
		public void clickOnAddToCartHP() {
		laptopHP.click();
		}
		public void clickOnAddToCartCanon() {
		canonEOS.click();
		}
		public void clickAddToCartButton() {
		addToCartButton.click();
		}
		public void shouldSeeAMessage() {
		messageText.isDisplayed();
		}
		public void enterYourName(String yourName) {
		nameField.sendKeys(yourName);
		}
		public void enterYourReview(String yourReview) {
		reviewField.sendKeys(yourReview);
		}
		public void enterRating(String rating) {
		ratingBox.click();
		}
		public void clickOnReviewLink() {
		writeReview.click();
		}
		public void selectQuantity() {
		quantity.click();
		}
		public void clickOnAddToCartLaptop() {
		addToCartLapTopHP.click();
		}
		public void shouldSeeAMessageLapTop() {
		messageText.isDisplayed();
		}
		public void clickAddToCartCanonE() {
		addToCartButtonCanonEOS.click();
		}
		public void selectColorDropDown() {
		redOption.click();
		}
		public void shouldSeeAMessageCanonCart() {
		messageText.isDisplayed();
		}
		public void clickOnCanonItem() {
		canonEOS.click();
		}
		public void clickOnContinueButton() {
		continueButton.click();
		}
		public void shouldSeeAReviewMessage() {
		aReviewMessage.isDisplayed();
		}
		public boolean isReviewSuccessMessagePresent() {
		String actualReviewSuccessMessage = aReviewMessage.getText();
		String expectedReviewSuccessMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
		if (actualReviewSuccessMessage.equals(expectedReviewSuccessMessage)) {
		return true;
		}else {
		return false;
		}
		}


}
