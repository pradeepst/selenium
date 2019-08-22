package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginobjects {
	
	//Constructor
	public loginobjects (WebDriver driver) {
              //With page factory- initialize below elements
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log In")
	 public WebElement Login;
	
	@FindBy(xpath="//*[@id= signinbutton']")
	public WebElement Signin;
	
	@FindBy(xpath= "//input[@id='si_popup_email']")
	  public WebElement emailid;
	
	@FindBy(xpath ="//input[@id='si_popup_passwd']")
	public WebElement password;
	
	@FindBy(xpath ="//button[@class='clik_btn_log btn-block pagesense_en_track']")
	public WebElement loginbutton;
	
	
	
}
