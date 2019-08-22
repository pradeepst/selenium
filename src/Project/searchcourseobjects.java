package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchcourseobjects {
	
	//Constructor
	
	public searchcourseobjects (WebDriver driver) {
        //With page factory- initialize below elements
	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[contains(text(),'All Courses')]")
	public WebElement allcourse;
	
	@FindBy(name ="user_v1[query]")
	 public WebElement searchfield;
	
	@FindBy (className ="typeahead__button")
		public WebElement searchbutton;
	
	@FindBy(xpath ="//li[contains(text(),'Security Management In AWS')]")
	public WebElement Course;
	
	@FindBy(xpath="//*[@id='d_wishlist-icon-535']")
	public WebElement wishlist1;
	
	@FindBy(xpath ="//*[@id='footer-blog']/a")
	public WebElement blog1;
	
}
