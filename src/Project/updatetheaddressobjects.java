package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class updatetheaddressobjects {

	//Constructor
	
	public updatetheaddressobjects (WebDriver driver) {
        //With page factory- initialize below elements
	
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath= "//input[@id='billingLine1']")
 public WebElement streetaddress;


@FindBy(xpath ="//input[@id='billingLine2']")
public WebElement apptno;

@FindBy(xpath="//input[@id='billingCity']")
 public WebElement city;


@FindBy(xpath="//select[@id='billingState']")
public WebElement state;

@FindBy(xpath ="//select[@id='billingState']")
public WebElement zipcode;

	
}
