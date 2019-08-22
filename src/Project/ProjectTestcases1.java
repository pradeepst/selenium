package Project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectTestcases1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		// Open AUT
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		Thread.sleep(3000);
		
		// Login Screen
				driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
				Thread.sleep(1000);
				// Enter email
				driver.findElement(By.id("si_popup_email")).sendKeys("testpradeep@gmail.com");
				Thread.sleep(1000);
				// Enter password
				driver.findElement(By.xpath("//*[@id='si_popup_passwd']")).sendKeys("india@1234");
				Thread.sleep(1000);
				// Click on Sign in button
				driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block pagesense_en_track']")).click();
				Thread.sleep(5000);
				
				//Explore all the courses available
					
				driver.findElement(By.xpath("//ul[@id='tabscathome']//a[@id='cloud-computing-certification-courses']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[contains(text(),'All Courses')]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//ul[@id='allc_catlist']//a[contains(text(),'Data Science')]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//ul[@class='nav nav-tabs categorylist']//a[contains(text(),'DevOps')]")).click();
				Thread.sleep(4000); 
				driver.findElement(By.xpath("//ul[@id='allc_catlist']//a[contains(text(),'Big Data')]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//ul[@class='nav nav-tabs categorylist']//a[contains(text(),'BI and Visualization')]")).click(); Thread.sleep(4000);
				Thread.sleep(4000); 
				driver.findElement(By.xpath("//input[@id='search-inp']")).sendKeys("selenium");
				Thread.sleep(4000);
				driver.findElement(By.className("typeahead__button")).click();
				Thread.sleep(4000);
				
				
				String MW = driver.getWindowHandle();
				System.out.println(MW);
				System.out.println("====================================================================");
				Thread.sleep(3000);
				
				
				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
				driver.findElement(By.xpath("//a[@class='trackButton'][contains(text(),'Blog')]")).sendKeys(selectLinkOpeninNewTab);
				Thread.sleep(1000);
				Set<String> AWN = driver.getWindowHandles();
				System.out.println(AWN);
				System.out.println("====================================================================");
				
		          for(String SW : driver.getWindowHandles()) {
					
					if (SW.equals(MW))
						{
						driver.switchTo().window(SW);
						
					}
		      }

				driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']//img[@class='img30']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[@class='giTrackElementHeader'][contains(text(),'My Profile')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='personal-details']//i[@class='icon-pr-edit']")).click();
				
				driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Guest");
				driver.findElement(By.className("icon-Arrow-Left")).click();
				driver.navigate().to("https://www.edureka.co/search/selenium");
				driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']//img[@class='img30']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[@class='trackButton'][contains(text(),'Log Out')]")).click();
				Thread.sleep(1000);
				driver.quit();
				
			}
			   
				
			

	}


