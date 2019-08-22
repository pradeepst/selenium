package Project;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginedureka {
	WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;

	
	
	@BeforeTest

	public  void TestSetup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		
		
		
		
		driver.get("https://www.edureka.co/");
	}
	
	
	@Test
	public void String () throws InterruptedException, IOException {
	
	
	loginobjects page =new loginobjects(driver);
	searchcourseobjects page1 = new searchcourseobjects(driver);
	addthecoureobjects page2 = new addthecoureobjects(driver);
	checkoutobjects page3 = new checkoutobjects(driver);
	updatetheaddressobjects page4= new updatetheaddressobjects(driver);
	cancelobjects page5 = new cancelobjects(driver);
	
		//enter email
		page.Login.click(); 
		Thread.sleep(3000);
		
		// Import excel sheet.
	File src=new File("C:\\Users\\pthippeswamy\\Documents\\ONE Drive\\Selenium\\SeleniumClass\\src\\Module10\\TESTDATA.xlsx");		
	
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
		
	String search=sheet.getRow(1).getCell(0).getStringCellValue();
	System.out.println(" course is " + search);
		
		page1.searchfield.sendKeys(search);
		Thread.sleep(3000);
		
		page1.searchfield.sendKeys(Keys.ENTER);
		
		page1.Course.click();
	
		page2.enrollnow.click();
		Thread.sleep(3000);
		
		page3.payment.click();
		Thread.sleep(3000);
		
		
		page3.visacheckout.click();
		
		//WebElement mouseHover = driver.findElement(By.xpath("//*[@alt ='visa']")).click();
		//Actions act = new Actions(driver);
		//act.moveToElement(mouseHover).click().build().perform();
		
		Thread.sleep(3000);
		
		String aptno=sheet.getRow(2).getCell(0).getStringCellValue();
		System.out.println(" apartment number" + aptno);
		
		String city=sheet.getRow(3).getCell(0).getStringCellValue();
		System.out.println(" apartment number" + city);
		
		String zipcode=sheet.getRow(3).getCell(0).getStringCellValue();
		System.out.println(" apartment number" + zipcode);
		
		
		
		page4.apptno.sendKeys(aptno);
		page4.city.sendKeys(city);
		page4.zipcode.sendKeys(zipcode);
		
		page5.cancel.click();
	
	}
	
	
}
