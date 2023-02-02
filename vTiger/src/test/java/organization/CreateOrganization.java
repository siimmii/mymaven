package organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.ExcelUtility;
import Generic_utility.FileUtility;
import Generic_utility.JavaUtility;
import ObjectRepo.HomePage;
import ObjectRepo.Login_page;
import ObjectRepo.OrganizationCreatePage;
import ObjectRepo.ValidationAndVerificationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import mypractice.PractiseValidationAndVerificationPage;

public class CreateOrganization  extends BaseClass{

	
	@Test
	public void createOrgMEthod() throws Throwable
	{
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//FileInputStream fis=new FileInputStream("src/test/resources/vtiger.properties");
		//Properties pro=new Properties();
		//pro.load(fis);
		//String URL=pro.getProperty("url");
		//String USERNAME=pro.getProperty("username");
		//String PASSWORD=pro.getProperty("password");
		
		
		//WebDriver driver;
		
		//FileUtility flib=new FileUtility();
		/*String BROWSER = flib.getKeyAndValue("browser");
		
		if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		
		*/
		/*
		//using pom login pages
		Login_page login=new Login_page(driver);
		login.loginToApp(USERNAME, PASSWORD);
		/*
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		*/
		
		//Random ran=new Random();
		//int ranNum=ran.nextInt(1000);
		//calling method for Random number from java utility
		JavaUtility j=new JavaUtility();
		int ranNum = j.getRandomNum();
//		
//		FileInputStream fi=new FileInputStream("C:\\Users\\akhil\\OneDrive\\Desktop\\product.xlsx");
//		Workbook book=WorkbookFactory.create(fi);
//		Sheet sh = book.getSheet("organization");
//		Row row = sh.getRow(0);
//		Cell cell = row.getCell(0);
//		String OrgName = cell.getStringCellValue()+ranNum;
		ExcelUtility exel=new ExcelUtility();
		String OrgName = exel.getExcelData("organization", 0, 0)+ranNum;
		
		HomePage home=new HomePage(driver);
		home.clickorganiztionLink();
		OrganizationCreatePage org=new OrganizationCreatePage(driver);
		org.clickOnOrganiztionImage();
		
		//driver.findElement(By.linkText("Organizations")).click();
		//driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		org.organiztionNameTextField(OrgName);
		org.saveOrgname();
		
		//ValidationAndVerificationPage vali=new ValidationAndVerificationPage(driver);
		
		///vali.organizationalValidation(driver, OrgName); 
		//home.signOUtLink(driver);
		
		//driver.findElement(By.name("accountname")).sendKeys(OrgName);
		//String myname = driver.findElement(By.xpath("(//td[@class='dvtCellInfo'])[1]")).getText();
		
		
		//System.out.println(myname);
		//driver.findElement(By.name("button")).click();
		
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();

		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//driver.findElement(By.linkText("Sign Out")).click();
	
	}

}
