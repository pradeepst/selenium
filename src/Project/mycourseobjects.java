package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mycourseobjects {

	public mycourseobjects (WebDriver driver) {
        //With page factory- initialize below elements
	
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath= "//*[@id= 'dropdownMenu3']")
	  public WebElement mycourse;
	
	@FindBy(xpath= "//*[@id='navbar']/ul/li[3]/div/ul/li[1]/a")
	  public WebElement Myclassroom;
	
	@FindBy(xpath= "//a[contains(text(),'Blog')]")
	  public WebElement Blog;




}
