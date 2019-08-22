package Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assignment {
	WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
   
    
    @BeforeTest

	public  void TestSetup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
	
		//driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(10000);
    }
       
    //Write an automation script to explore the courses available on edureka portal and add them to wishlist.
    //Check if the same is reflected in the wishlist and can be enrolled from the wishlist bucket. 
    //Update the profile of the user and the same is reflected post update. 
    //Explore all the courses enrolled under “My course” tab. Explore the selenium blogs written.
    
    
  @Test
  public void testcase1() throws InterruptedException, IOException {
	  
	    loginobjects page =new loginobjects(driver);
		searchcourseobjects page1 = new searchcourseobjects(driver);
		addthecoureobjects page2 = new addthecoureobjects(driver);
		checkoutobjects page3 = new checkoutobjects(driver);
		updatetheaddressobjects page4= new updatetheaddressobjects(driver);
		cancelobjects page5 = new cancelobjects(driver);
		Profileobjects page6 = new Profileobjects(driver);
		mycourseobjects page7 = new mycourseobjects(driver);
		logoutobjects page8 = new logoutobjects(driver);
		
			//Click login.
			page.Login.click(); 
			Thread.sleep(5000);
			
			// Import excel sheet.
		File src=new File("C:\\Users\\pthippeswamy\\Documents\\ONE Drive\\Selenium\\SeleniumClass\\src\\Project1\\TESTDATA.xlsx");		
		
		// Load the file.
		FileInputStream fis = new FileInputStream(src);
		
		// Load the workbook.
		workbook = new XSSFWorkbook(fis);
			
		// Load the sheet in which data is stored.
		sheet= workbook.getSheet("Sheet1");
			
		//cell = sheet.getRow(RowNum).getCell(ColNum);
		//String CellData = cell.getStringCellValue();
			
		String email=sheet.getRow(0).getCell(0).getStringCellValue();
		String password = sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(" emailid is " + email);
		System.out.println("password is  " + password);
				
			
			page.emailid.sendKeys(email);
			Thread.sleep(3000);
			
			page.password.sendKeys(password);
			Thread.sleep(3000);
			
			page.loginbutton.click();
			Thread.sleep(5000);
		
			page1.allcourse.click();
			Thread.sleep(1000);
			
           String search=sheet.getRow(1).getCell(0).getStringCellValue();
			
			System.out.println(" course is " + search);
			
			
			page1.searchfield.sendKeys(search);
			Thread.sleep(3000);
			
			page1.searchfield.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			page1.wishlist1.click();
			Thread.sleep(3000);
			page1.wishlist1.click();
			Thread.sleep(3000);
			
			page6.profile.click();
			Thread.sleep(3000);
			
			page6.myprofile.click();
			Thread.sleep(3000);
			
			page6.editprofile.click();
			Thread.sleep(3000);
			
			page6.name.clear();
			Thread.sleep(1000);
			page6.name.sendKeys("Guest");
			Thread.sleep(1000);
			
			page6.currentrole.clear();
			Thread.sleep(1000);
			page6.currentrole.sendKeys("Manual Tester");
			Thread.sleep(1000);
			
			
			page6.experience.sendKeys("2-4Years");
			Thread.sleep(1000);
			
			page6.continue1.click();
			Thread.sleep(1000);
			page6.back.click();
			Thread.sleep(1000);
			
			driver.navigate().to("https://www.edureka.co/all-courses");
		
	        page7.mycourse.click();
	        Thread.sleep(1000);
	        page7.Myclassroom.click();
	        Thread.sleep(1000);
	        page7.Blog.click();
	        
	    
	        page8.logout.click();
	        Thread.sleep(10000);
	        
  }
  
  //Testing Edureka portal to check the enrolled courses for a user
  //Steps:	  
  //1. Login to the Portal
  //2. Navigate to the My Course Page
  //3. Validate if any courses have been enrolled for the user
  //4. Logout of the Portal
  
	
	  @Test public void testcase2() throws InterruptedException, IOException {
		  
		    loginobjects page =new loginobjects(driver);
			searchcourseobjects page1 = new searchcourseobjects(driver);
			addthecoureobjects page2 = new addthecoureobjects(driver);
			Profileobjects page6 = new Profileobjects(driver);
			mycourseobjects page7 = new mycourseobjects(driver);
			logoutobjects page8 = new logoutobjects(driver);
		  
			driver.get("https://www.edureka.co/");
			driver.manage().window().maximize();
		
			
			
			
		//Click login.
			page.Login.click(); 
			Thread.sleep(5000);
			
			// Import excel sheet.
		File src=new File("C:\\Users\\pthippeswamy\\Documents\\ONE Drive\\Selenium\\SeleniumClass\\src\\Project1\\TESTDATA.xlsx");		
		
		// Load the file.
		FileInputStream fis = new FileInputStream(src);
		
		// Load the workbook.
		workbook = new XSSFWorkbook(fis);
			
		// Load the sheet in which data is stored.
		sheet= workbook.getSheet("Sheet1");
			
		//cell = sheet.getRow(RowNum).getCell(ColNum);
		//String CellData = cell.getStringCellValue();
			
		String email=sheet.getRow(0).getCell(0).getStringCellValue();
		String password = sheet.getRow(0).getCell(1).getStringCellValue();
		
				
			page.emailid.clear();
			page.emailid.sendKeys(email);
			Thread.sleep(3000);
			
			page.password.sendKeys(password);
			Thread.sleep(3000);
			
			page.loginbutton.click();
			Thread.sleep(5000);
			
			page7.mycourse.click();
	        Thread.sleep(1000);
	        page7.Myclassroom.click();
	        Thread.sleep(1000);
	        
	        page6.username.click();
			Thread.sleep(3000);
			
	        
	        page6.logout1.click();
	        Thread.sleep(5000);
		  
	  
	  }

	  
	//  Testing Edureka Portal to list the blogs written on selenium
	//  Steps:
	//  1. Login to the portal
	//  2. Navigate to blogs page
	//  3. Refine the search for selenium blogs.
	//  4. Explore the blogs on interview questions
	//  5. Close all the blogs tab.
	  
	  @Test public void testcase3 () throws InterruptedException, IOException {
		  
		    loginobjects page =new loginobjects(driver);
			searchcourseobjects page1 = new searchcourseobjects(driver);
			addthecoureobjects page2 = new addthecoureobjects(driver);
			Profileobjects page6 = new Profileobjects(driver);
			mycourseobjects page7 = new mycourseobjects(driver);
			logoutobjects page8 = new logoutobjects(driver);
			blogsobjects page9 = new blogsobjects(driver);
		  
			driver.get("https://www.edureka.co/");
			driver.manage().window().maximize();
		
						
			
		//Click login.
			page.Login.click(); 
			Thread.sleep(5000);
			
			// Import excel sheet.
		File src=new File("C:\\Users\\pthippeswamy\\Documents\\ONE Drive\\Selenium\\SeleniumClass\\src\\Project1\\TESTDATA.xlsx");		
		
		// Load the file.
		FileInputStream fis = new FileInputStream(src);
		
		// Load the workbook.
		workbook = new XSSFWorkbook(fis);
			
		// Load the sheet in which data is stored.
		sheet= workbook.getSheet("Sheet1");
			
		//cell = sheet.getRow(RowNum).getCell(ColNum);
		//String CellData = cell.getStringCellValue();
			
		String email=sheet.getRow(0).getCell(0).getStringCellValue();
		String password = sheet.getRow(0).getCell(1).getStringCellValue();
		
				
			page.emailid.clear();
			page.emailid.sendKeys(email);
			Thread.sleep(3000);
			
			page.password.sendKeys(password);
			Thread.sleep(3000);
			
			page.loginbutton.click();
			Thread.sleep(5000);  
	  
			page1.blog1.click();
			Thread.sleep(3000);
			
			page9.refinesearch.sendKeys("Selenium");
			Thread.sleep(3000);
			
			page9.searchblog.click();
			Thread.sleep(3000);
			
			page9.interviewquestions.click();
			Thread.sleep(5000);
		        
		    page9.logout.click();
	        Thread.sleep(10000);
			
			
	  }
	 
	 // Testing Edureka Portal for selenium course
	 //Steps
	 //  1. Login to the portal
	 //  2. Navigate to “All Course” page
	 //  3. Refine the search for selenium
	 //  4. Add the selenium course to wishlist.
	 //  5. Check that selenium course s added in the users wishlist
	 //  6. Try enrolling can be done from the wishlist page
	  
	  @Test public void testcase4 () throws InterruptedException, IOException {
		  
		    loginobjects page =new loginobjects(driver);
			searchcourseobjects page1 = new searchcourseobjects(driver);
			addthecoureobjects page2 = new addthecoureobjects(driver);
			Profileobjects page6 = new Profileobjects(driver);
			mycourseobjects page7 = new mycourseobjects(driver);
			logoutobjects page8 = new logoutobjects(driver);
			blogsobjects page9 = new blogsobjects(driver);
		  
			driver.get("https://www.edureka.co/");
			driver.manage().window().maximize();
		
						
			
		//Click login.
			page.Login.click(); 
			Thread.sleep(5000);
			
			// Import excel sheet.
		File src=new File("C:\\Users\\pthippeswamy\\Documents\\ONE Drive\\Selenium\\Project\\src\\Project\\TESTDATA.xlsx");		
		
		// Load the file.
		FileInputStream fis = new FileInputStream(src);
		
		// Load the workbook.
		workbook = new XSSFWorkbook(fis);
			
		// Load the sheet in which data is stored.
		sheet= workbook.getSheet("Sheet1");
			
		//cell = sheet.getRow(RowNum).getCell(ColNum);
		//String CellData = cell.getStringCellValue();
			
		String email=sheet.getRow(0).getCell(0).getStringCellValue();
		String password = sheet.getRow(0).getCell(1).getStringCellValue();
		
		
			page.emailid.clear();
			page.emailid.sendKeys(email);
			Thread.sleep(3000);
			
			page.password.sendKeys(password);
			Thread.sleep(3000);
			
			page.loginbutton.click();
			Thread.sleep(3000);  
			
			page1.allcourse.click();
			Thread.sleep(3000);
			
            String search=sheet.getRow(1).getCell(0).getStringCellValue();
			
			System.out.println(" course is " + search);
			
			
			page1.searchfield.sendKeys(search);
			Thread.sleep(3000);
			
			page1.searchfield.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			page1.wishlist1.click();
			Thread.sleep(3000);
			page1.wishlist1.click();
			Thread.sleep(3000);
			
			page6.profile.click();
			Thread.sleep(3000);
			
			page6.Wishlist.click();
			Thread.sleep(5000);
			
			page6.profile.click();
			Thread.sleep(5000);
			
			page6.logout1.click();
			Thread.sleep(5000); 			
	  
	  
	  }  
	  
	 // Testing Edureka portal to update the user profile data
	 // Steps:
	//  1. Login to the portal
	//  2. Navigate to My Profile
	//  3. Click on Edit Profile for the user
	//  4. Update all the Professional details
	//  5. Save the data and ensure that the data is updated.
	//  6. Close the browser
	  
	  @Test public void testcase5 () throws InterruptedException, IOException {
		  
		    loginobjects page =new loginobjects(driver);
			searchcourseobjects page1 = new searchcourseobjects(driver);
			addthecoureobjects page2 = new addthecoureobjects(driver);
			Profileobjects page6 = new Profileobjects(driver);
			mycourseobjects page7 = new mycourseobjects(driver);
			logoutobjects page8 = new logoutobjects(driver);
			blogsobjects page9 = new blogsobjects(driver);
		  
			driver.get("https://www.edureka.co/");
			driver.manage().window().maximize();
		
						
			
		//Click login.
			page.Login.click(); 
			Thread.sleep(5000);
			
			// Import excel sheet.
		File src=new File("C:\\Users\\pthippeswamy\\Documents\\ONE Drive\\Selenium\\Project\\src\\Project\\TESTDATA.xlsx");		
		
		// Load the file.
		FileInputStream fis = new FileInputStream(src);
		
		// Load the workbook.
		workbook = new XSSFWorkbook(fis);
			
		// Load the sheet in which data is stored.
		sheet= workbook.getSheet("Sheet1");
			
		//cell = sheet.getRow(RowNum).getCell(ColNum);
		//String CellData = cell.getStringCellValue();
			
		String email=sheet.getRow(0).getCell(0).getStringCellValue();
		String password = sheet.getRow(0).getCell(1).getStringCellValue();
		
		
			page.emailid.clear();
			page.emailid.sendKeys(email);
			Thread.sleep(3000);
			
			page.password.sendKeys(password);
			Thread.sleep(3000);
			
			page.loginbutton.click();
			Thread.sleep(3000);  
  
			page6.profile.click();
			Thread.sleep(3000);
			
			page6.myprofile.click();
			Thread.sleep(3000);
			
			page6.editprofile.click();
			Thread.sleep(3000);
			
			page6.name.clear();
			Thread.sleep(1000);
			page6.name.sendKeys("Guest");
			Thread.sleep(1000);
			
			page6.currentrole.clear();
			Thread.sleep(3000);
			page6.currentrole.sendKeys("Manual Tester");
			Thread.sleep(3000);
			
			
			page6.experience.sendKeys("2-4Years");
			Thread.sleep(3000);
			
			page6.continue1.click();
			Thread.sleep(3000);
			
			page6.skip.click();
			Thread.sleep(3000);
			
			page6.companyname.clear();
			String organization=sheet.getRow(2).getCell(0).getStringCellValue();
			
			page6.companyname.sendKeys(organization);
			
			//Select Class to focus on the DropDown
			Select oSelect = new Select(page6.currentindustry);
			
			//Select by Index - IT- Software
			oSelect.selectByIndex(1);
			Thread.sleep(5000);
			
			//Select Class to focus on the DropDown
			Select Select1 = new Select(page6.currentjob);
			
			//Select by Index - IT- Software
			Select1.selectByIndex(1);
			Thread.sleep(5000);
			
			page6.Skills.clear();
			String skills=sheet.getRow(3).getCell(0).getStringCellValue();
			page6.Skills.sendKeys(skills);
			
			Thread.sleep(5000);
			page6.linkedin.clear();
			String linkedin=sheet.getRow(4).getCell(0).getStringCellValue();
			page6.linkedin.sendKeys(linkedin);
			Thread.sleep(5000);
			
			page6.submit.click();
			Thread.sleep(5000);
				
			driver.quit();
			
	  }  
}
