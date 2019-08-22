package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class edurakaportal {

	
		
		public static WebDriver driver;
		
		@BeforeTest

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.get("https://gmail.com");
			driver.manage().window().maximize();
			
			
			loginobjects page =new loginobjects(driver);
			searchcourseobjects page1 = new searchcourseobjects(driver);
			addthecoureobjects page2 = new addthecoureobjects(driver);
			checkoutobjects page3 = new checkoutobjects(driver);
			updatetheaddressobjects page4= new updatetheaddressobjects(driver);
			cancelobjects page5 = new cancelobjects(driver);
			
			
					
			
	}

}
