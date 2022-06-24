package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayerPageObject extends Base {
	
	public Mp3PlayerPageObject() {
		PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
		private WebElement classicIpod;

		@FindBy(xpath = "//a[contains(text(),'iPod Nano')]")
		private WebElement nanoIpod;



		@FindBy(xpath = "//a[contains(text(),'iPod Shuffle')]")
		private WebElement shuffleIpod;



		@FindBy(xpath = "//a[contains(text(),'iPod Touch')]")
		private WebElement touchIpod;



		@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
		private WebElement refineSearchText;



		@FindBy(xpath = "//a[@id='compare-total']")
		private WebElement productCompare;



		@FindBy(xpath = "//h2[contains(text(),'MP3 Players')]")
		private WebElement mp3PlayersText;





		
}
