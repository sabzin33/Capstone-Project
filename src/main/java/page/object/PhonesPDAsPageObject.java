package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {
	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
		private WebElement touchHd;

		@FindBy(xpath = "//a[contains(text(),'iPhone')]")
		private WebElement iPhone;

		@FindBy(xpath = "//a[contains(text(),'Palm Treo Pro')]")
		private WebElement treoPro;

		@FindBy(xpath = "//button[@id='list-view']")
		private WebElement listButton;

		@FindBy(xpath = "//button[@id='grid-view']")
		private WebElement gridButton;
		}

