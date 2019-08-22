package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutobjects {
	

		public logoutobjects (WebDriver driver) {
	        //With page factory- initialize below elements
		
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath= "//*[@id= 'signin-logout']")
		  public WebElement logout;

}
