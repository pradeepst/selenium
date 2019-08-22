package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutobjects {

	//Constructor
	
			public checkoutobjects (WebDriver driver) {
		        //With page factory- initialize below elements
			
			PageFactory.initElements(driver, this);

	}
			
  @FindBy(xpath= "//button[@class='pymt_btn pymt_btn_batch osp_ga']")
   public WebElement payment;
  
  @FindBy(xpath="//*[@id=\'cddccard\']/div[2]/button")
    public WebElement visacheckout;
  
   

}
