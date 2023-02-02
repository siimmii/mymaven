package products;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_utility.ExcelUtility;
import Generic_utility.FileUtility;
import Generic_utility.JavaUtility;
import ObjectRepo.HomePage;
import ObjectRepo.Login_page;
import ObjectRepo.ProductCreationPage;

public class CreateProduct {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileUtility f=new FileUtility();
		String URL=f.getKeyAndValue("url");
		String USERNAME=f.getKeyAndValue("username");
		String PASSWORD=f.getKeyAndValue("password");
		driver.get(URL);
		//FileInputStream fis=new FileInputStream("src/test/resources/vtiger.properties");
		//Properties pro=new Properties();
		//pro.load(fis);
		//String URL=pro.getProperty("url");
		//String USERNAME=pro.getProperty("username");
		//String PASSWORD=pro.getProperty("password");
		
		Login_page login=new Login_page(driver);
		login.loginToApp(USERNAME, PASSWORD);
		//driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		//driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		//driver.findElement(By.id("submitButton")).click();
		JavaUtility j=new JavaUtility();
		int ranNum=j.getRandomNum();
		
		
		HomePage home=new HomePage(driver);
		home.productsLink();
		//driver.findElement(By.linkText("Products")).click();
		ProductCreationPage p=new ProductCreationPage(driver);
		p.clickProductLinkImage();
		//driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		
			ExcelUtility ex=new ExcelUtility();
			String productname=ex.getExcelData("ProductNameSheet", 0,0)+ranNum;
			p.productNameTextfield(productname);
			p.saveProductName();
			home.signOUtLink(driver);
	
		
		/*FileInputStream fis1=new FileInputStream("C:\\Users\\akhil\\OneDrive\\Desktop\\product.xlsx");

		Workbook book=WorkbookFactory.create(fis1);
	    org.apache.poi.ss.usermodel.Sheet sh = book.getSheet("Sheet1");
		 Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		String Productname = cell.getStringCellValue()+ranNum;
		
		driver.findElement(By.name("productname")).sendKeys(Productname);
		
		driver.findElement(By.name("button")).click();
		
	
		Thread.sleep(100);
		

		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
	}*/
}}
