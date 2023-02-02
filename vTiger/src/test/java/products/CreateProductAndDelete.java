package products;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateProductAndDelete {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
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
		
		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		
	
		
		Random ran=new Random();
		int ranNum=ran.nextInt(1000);
		
		
		FileInputStream fis1=new FileInputStream("C:\\Users\\akhil\\OneDrive\\Desktop\\product.xlsx");

		Workbook book=WorkbookFactory.create(fis1);
	    org.apache.poi.ss.usermodel.Sheet sh = book.getSheet("Sheet1");
		 Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		String Productname = cell.getStringCellValue()+ranNum;
		
		driver.findElement(By.name("productname")).sendKeys(Productname);
		
		driver.findElement(By.name("button")).click();
		driver.findElement(By.name("Delete")).click();
		driver.switchTo().alert().accept();
	
		Thread.sleep(100);
		

		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
	}

}
