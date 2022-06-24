package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base{
	
	public ComponentsPageObject() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValildate;
	@FindBy(xpath = "//a[text()= 'Show All Components']")
	private WebElement showAllText;
	@FindBy(xpath = "//a[text() ='Components']")
	private WebElement componentsText;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement miceAndTrackballsText;
	// @FindBy(xpath = "//a[text()='Mice and Trackballs (0)']")
	// private WebElement miceAndTrackballsText;
	@FindBy(xpath = "//a[text()='Monitors (2)']")
	private WebElement monitorsText;
	@FindBy(xpath = "//a[text()='Printers (0)']")
	private WebElement printersText;
	@FindBy(xpath = "//a[text()='Scanners (0)']")
	private WebElement scannersText;
	@FindBy(xpath = "//a[text()='Web Cameras (0)']")
	private WebElement webElementText;
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continueButton;
	public void validateHomePage() {
	String text = textToValildate.getText();
	if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
	logger.info("Text verified!");
	}else {
	logger.info("Text does not match!");
	} }
	public void clickOnConponentsButton() {
	componentsText.click();
	}
	public void clickOnShowAllComponents() {
	showAllText.click();
	}
	public void clickOnMiceAndTrackballs() {
	miceAndTrackballsText.click();
	}
	public void clickOnContinueButton() {
	continueButton.click();
	}
	


}
