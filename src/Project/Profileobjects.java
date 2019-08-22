package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profileobjects {
	
	
	public Profileobjects (WebDriver driver) {
        //With page factory- initialize below elements
	
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath= "//*[@id= 'header-II']/section/nav/div/ul[2]/li[1]/a/span")
	  public WebElement profile;
	
	@FindBy(xpath ="//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[@class='giTrackElementHeader'][contains(text(),'My Profile')]")
	public WebElement myprofile;
	
	@FindBy(xpath ="//div[@class='personal-details']//i[@class='icon-pr-edit']")
	public WebElement editprofile;
	
	@FindBy(xpath ="//input[@placeholder='Name']")
	public WebElement name;
	
	@FindBy(xpath ="//input[@name='currentrole']")
	public WebElement currentrole;
	
	@FindBy(xpath ="//select[@id='experience']")
	public WebElement experience;
	
	@FindBy(xpath ="//li[@class='brand-logo']//i[@class='icon-Arrow-Left']")
	public WebElement back;
	
	@FindBy(xpath ="//*[@id= 'collapseOne']/div/div/form/button")
	public WebElement continue1;
	
	@FindBy(className="user_name")
	public WebElement username;
	
	@FindBy(linkText = "Log Out")
	public WebElement logout1;
	
	@FindBy(xpath="//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[@class='trackButton giTrackElementHeader'][contains(text(),'My Wishlist')]")
	public WebElement Wishlist;
	
	@FindBy(xpath="//*[@id='professional_details']/i")
	public WebElement professionaldetails;
	
	@FindBy(xpath="//input[@placeholder='Enter Company Name']")
	public WebElement companyname;
	
	@FindBy(xpath="//select[@name='currentIndustry']")
	public WebElement currentindustry;
	
	
	@FindBy(xpath="//input[@placeholder='Enter skills (separated by commas)']")
	public WebElement Skills;
	
	@FindBy(xpath="//select[@name='currentjob']")
	public WebElement currentjob;
	
	
	@FindBy(xpath="//input[@placeholder='https://linkedin.com/']")
	public WebElement linkedin;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	
	
	@FindBy(xpath="//a[@class='skip']")
	public WebElement skip;
	
	@FindBy(xpath="//*[@id='header-II']/section/nav/div/ul[2]/li[1]/ul/li[7]/a")
	public WebElement logout2;
	
	
	
	
	
	
}
