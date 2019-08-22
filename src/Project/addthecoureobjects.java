package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addthecoureobjects {
	
	//Constructor
	
		public addthecoureobjects (WebDriver driver) {
	        //With page factory- initialize below elements
		
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath  = "//button[@class='paypal']")
	public WebElement enrollnow;
	
}
