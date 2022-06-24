package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {
	
	public SoftwarePageObject() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h2[contains(text(),'Software')]")
	private WebElement softwareText;
	@FindBy(xpath = "//p[contains(text(),'There are no products to list in this category.')]")
	private WebElement productListText;
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	private WebElement continueButton;
	@FindBy(xpath = "//body/div[@id='product-category']/ul[1]")
	private WebElement productCategoryBox;


}
