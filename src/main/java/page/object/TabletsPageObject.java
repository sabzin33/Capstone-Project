package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base {
	 
	public TabletsPageObject() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),'Tablets')]")
	private WebElement tabletsTextButton;
	@FindBy(xpath = "//a[contains(text(),'Samsung Galaxy Tab 10.1')]")
	private WebElement samsungTab;
	@FindBy(xpath = "//p[contains(text(),'Samsung Galaxy Tab 10.1, is the world’s thinnest t')]")
	private WebElement tabletDisplayText;
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement tabletsInputSort;
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement tabletsIputLimit;
	@FindBy(xpath = "//div[contains(text(),'Showing 1 to 1 of 1 (1 Pages)')]")
	private WebElement tabletPageShowing;


}
