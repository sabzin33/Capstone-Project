package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//span[text()='My Account']")
		private WebElement myAccount;

		@FindBy(xpath = "//a[text() ='Login']")
		private WebElement logIn;

		@FindBy(xpath = "//input[@id='input-email']")
		private WebElement userNameField;

		@FindBy(xpath = "//input[@id='input-password']")
		private WebElement passWordField;

		@FindBy(xpath = "//input[@value ='Login']")
		private WebElement logInButton;

		@FindBy(xpath = "//body")
		private WebElement myAccountDashBoard;

		@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
		private WebElement registerForAffiliateAccount;

		@FindBy(xpath = "//input[@id='input-company']")
		private WebElement companyField;

		@FindBy(xpath = "//input[@id='input-website']")
		private WebElement webSiteField;

		@FindBy(xpath = "//input[@id='input-tax']")
		private WebElement taxIdField;

		@FindBy(xpath = "//input[@value='cheque']")
		private WebElement chequeField;

		@FindBy(xpath = "//input[@id='input-cheque']")
		private WebElement chequePayeeName;

		@FindBy(xpath = "//input[@value='bank']")
		private WebElement bankTransferField;

		@FindBy(xpath = "//input[@id='input-bank-name']")
		private WebElement bankNameField;

		@FindBy(xpath = "//input[@id='input-bank-branch-number']")
		private WebElement abaNumberField;

		@FindBy(xpath = "//input[@id='input-bank-swift-code']")
		private WebElement swiftCodeField;

		@FindBy(xpath = "//input[@id='input-bank-account-name']")
		private WebElement accountNameField;

		@FindBy(xpath = "//input[@id='input-bank-account-number']")
		private WebElement accountNumberField;

		@FindBy(xpath = "//input[@id='input-firstname']")
		private WebElement firstNameField;

		@FindBy(xpath = "//input[@id='input-lastname']")
		private WebElement lastNameField;

		@FindBy(xpath = "//input[@id='input-email']")
		private WebElement emailField;

		@FindBy(xpath = "//input[@id='input-telephone']")
		private WebElement telephoneField;

		@FindBy(xpath = "//input[@name='agree']")
		private WebElement checkBox;

		@FindBy(xpath = "//input[@value='Continue']")
		private WebElement continueButton;

		@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
		private WebElement successMessage;

		@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
		private WebElement editAffiliateInfo;

		@FindBy(xpath = "//input[@value='bank']")
		private WebElement bankTransfer;



		@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
		private WebElement editAccountInfoLink;



		@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
		private WebElement messageUpdated;






		/* public void verifyAffiliateAccSuccessMessage() {
		String expectedMessage = "Succes: Your account has been successfully updated.";
		String actualMessage = successMessage.getText();
		try {
		Assert.assertEquals(expectedMessage, actualMessage);
		}catch (Exception e) {
		e.printStackTrace();
		}
		}
		*/
		public void clickOnMyAccount() {
		myAccount.click();
		}
		public void clickOnLogin() {
		logIn.click();
		}
		public void enterUsername() {
		userNameField.sendKeys("sabzina.tek1@gmail.com");
		}
		public void enterPassword() {
		passWordField.sendKeys("12345678");
		}
		public void clickOnLoginButton() {
		logInButton.click();
		}
		public void shouldBeLoggedInToMyAccountDashboard() {
		myAccountDashBoard.isDisplayed();
		}
		public void clickOnRegisterForAffiliateAccountLink() {
		registerForAffiliateAccount.click();
		}
		public void enterCompany(String company) {
		companyField.sendKeys(company);
		}
		public void enterWebsite(String website) {
		webSiteField.sendKeys(website);
		}
		public void enterTaxID(String taxID) {
		taxIdField.sendKeys(taxID);
		}
		public void enterPaymentMethod(String paymentMethod) {
		chequePayeeName.sendKeys(paymentMethod);
		}
		public void enterBankName(String bankName) {
		bankNameField.sendKeys(bankName);
		}
		public void enterABANumber(String abaNumber) {
		abaNumberField.sendKeys(abaNumber);
		}
		public void enterswiftCode(String swiftCode) {
		swiftCodeField.sendKeys(swiftCode);
		}
		public void enterAccountName(String accountName) {
		accountNameField.sendKeys(accountName);
		}
		public void enterAccountNumber(String accountNumber) {
		accountNumberField.sendKeys(accountNumber);
		}
		public void enterFirstName(String firstname) {
		firstNameField.clear();
		firstNameField.sendKeys(firstname);
		}
		public void enterLastName(String lastName) {
		lastNameField.clear();
		lastNameField.sendKeys(lastName);
		}
		public void enterEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
		}
		public void enterTelephone(String telephone) {
		telephoneField.clear();
		telephoneField.sendKeys(telephone);
		}
		public void checkOnAboutUsCheckBox() {
		checkBox.click();
		}
		public void clickOnContinueButton() {
		continueButton.click();
		}
		public void shouldSeeSuccessMessage() {
		successMessage.isDisplayed();
		}
		public void clickOnEditYourAffiliateInfoLink() {
		editAffiliateInfo.click();
		}
		public void clickOnBankTransferRadioButton() {
		bankTransfer.click();
		}
		public void clickOnEditYouAccountInfoLink() {
		editAccountInfoLink.click();
		}

		public void shouldSeeMessageSuccessUpdated() {
		messageUpdated.isDisplayed();
		}
		


}
