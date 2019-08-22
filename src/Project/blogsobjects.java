package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class blogsobjects {
	
	
	public blogsobjects (WebDriver driver) {
        //With page factory- initialize below elements
	
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath= "//input[@id='search-inp']")
	  public WebElement refinesearch;
	
	@FindBy(xpath= "//*[@id='remote']/div/span[2]/i[1]")
	  public WebElement searchblog;
	
	
	@FindBy(xpath= "//a[contains(@class,'btn-outline-primary')][contains(text(),'Interview Questions')]")
	  public WebElement interviewquestions;
	
	@FindBy(xpath="//*[@id='signin-logout']")
	public WebElement logout;

}
