package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base

{
	public LaptopsNoteBooksPageObject() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValildate;
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement hpLaptop;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement macBook;
	@FindBy(xpath = "//a[contains(text(),'MacBook Air')]")
	private WebElement macBookAir;
	@FindBy(xpath = "//a[contains(text(),'Sony VAIO')]")
	private WebElement sonyVaio;
	@FindBy(xpath = "//label[contains(text(),'Sort By:')]")
	private WebElement labelBox;
	@FindBy(xpath = "//label[contains(text(),'Show:')]")
	private WebElement showBox;
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement laptopNoteBooksTab;
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLaptopNoteBooks;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessageAdded;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement itemShowedToCart;
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement cartOptionButton;
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
	private WebElement redXButton;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement removedItem;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement macBookProductComparisonButton;
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
	private WebElement macBookAirProductComparisonButton;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement shouldSeeComparisonSuccessMessage;
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productComparisonLink;
	@FindBy(xpath = "//body")
	private WebElement productComparisonChart;
	@FindBy(css = "div.container:nth-child(4) div.row div.col-sm-9 div.row:nth-child(7) div.product-layout.product-grid.col-lg-4.col-md-4.col-sm-6.col-xs-12:nth-child(5) div.product-thumb div:nth-child(2) div.button-group button:nth-child(2) > i.fa.fa-heart")
	private WebElement addToWishListSony;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement messageMustLogInToAccount;
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement macBookProItem;
	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement macBookProPriceTag;
	/* public void validateHomePage() {
	String text = textToValildate.getText();
	if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
	logger.info("Text verified!");
	}else {
	logger.info("Text does not match!");
	}
	*/
	public void clickOnLaptopNoteBookTab() {
	laptopNoteBooksTab.click();
	}
	public void clickOnShowAllLaptopNoteBook() {
	showAllLaptopNoteBooks.click();
	}
	public void clickOnMacBookItem() {
	macBook.click();
	}
	public void clickAddToCartButton() {
	addToCartButton.click();
	}
	public void shouldSeeSuccessAddedMessage() {
	successMessageAdded.isDisplayed();
	}
	public void shouldSeeItemShowedToCart() {
	itemShowedToCart.isDisplayed();
	}
	public void clickOnCartOption() {
	cartOptionButton.click();
	}
	public void clickOnRedXButton() {
	redXButton.click();
	}
	public void itemShouldBeRemoved() {
	removedItem.isDisplayed();
	}
	public void clickOnProductComparisonIconMacBook() {
	macBookProductComparisonButton.click();
	}
	public void clickOnProductComparisonIconMacBookAir() {
	macBookAirProductComparisonButton.click();
	}
	public void shouldSeeMessageSuccessAddedMacbookAirToProductComparison() {
	shouldSeeComparisonSuccessMessage.isDisplayed();
	}
	public void clickOnProductComparisonLink() {
	productComparisonLink.click();
	}
	public void shouldSeeProductComparisonChart() {
	productComparisonChart.isDisplayed();
	}
	public void clickOnHeartIconToAddSonyToWishList() {
	addToWishListSony.click();
	}
	public void shouldSeeMessageMustLoginOrCreateAnAccount() {
	messageMustLogInToAccount.isDisplayed();
	}
	public void clickOnMacBookProItem() {
	macBookProItem.click();
	}
	public void shouldSeePriceTag() {
	macBookProPriceTag.isDisplayed();
	}


}
