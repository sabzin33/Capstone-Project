package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	
	public HomePageObject() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[contains(text(),'123456789')]")
	private WebElement phoneNumber;
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	@FindBy(xpath = "//span[contains(text(),'Wish List (0)')]")
	private WebElement wishList;
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	private WebElement checkOut;
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement testEnvironmentText;
	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement search;
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement itemsButton;
	@FindBy(xpath = "//h5[contains(text(),'Information')]")
	private WebElement inforomationText;
	@FindBy(xpath = "//h5[contains(text(),'Customer Service')]")
	private WebElement customerServiceText;
	@FindBy(xpath = "//h5[contains(text(),'Extras')]")
	private WebElement extrasText;
	@FindBy(xpath = "//h5[contains(text(),'My Account')]")
	private WebElement myAccountText;
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement currency;
	@FindBy(xpath = "//div[@id='content']")
	private WebElement contentImage;
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euro;
	@FindBy(xpath = "//body")
	private WebElement currencyChanged;
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement shoppingCartMessage;
	public void clickOnCurrency() {
	currency.click();
	}
	public void choseEuroFromDropdown() {
	euro.click();
	}
	public void currencyValueShouldChangeEuro() {
	currencyChanged.isDisplayed();
	}
	public void clickOnShoppingCart() {
	shoppingCart.click();
	}
	public void yourShoppingCartIsEmpteyMessage() {
	shoppingCartMessage.isDisplayed();
	}


}
