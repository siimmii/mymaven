package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger_Organizaon {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis=new FileInputStream("src/test/resources/vtiger.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String URL=pro.getProperty("url");
		String USERNAME=pro.getProperty("username");
		String PASSWORD=pro.getProperty("password");
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		
		Actions a=new Actions(driver);
		//WebElement organization =
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		
		FileInputStream fis1=new FileInputStream("C:\\Users\\akhil\\OneDrive\\Desktop\\simmi_updated.xlsx");
	
		Workbook book=WorkbookFactory.create(fis1);
	    org.apache.poi.ss.usermodel.Sheet sh = book.getSheet("Sheet1");
		 Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		String Orgname = cell.getStringCellValue();
		//driver.findElement(By.name("")).sendKeys(Orgname);
		
		
		Thread.sleep(100);
		driver.findElement(By.name("accountname")).sendKeys(Orgname);
		
		//driver.findElement(By.name("accountname")).sendKeys(Orgname);
		//a.moveToElement(organization).perform().click;
		
	}

}
