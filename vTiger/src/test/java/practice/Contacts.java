package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contacts {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream("src/test/resources/vtiger_org.properties");
		Properties p=new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		Random ran=new Random();
		int ranNum=ran.nextInt(1000);
		
		
		
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		
		//fetching data from excel
		
		FileInputStream fis1=new FileInputStream("C:\\Users\\akhil\\OneDrive\\Desktop\\product.xlsx");
		Workbook book=WorkbookFactory.create(fis1);
		Sheet sh = book.getSheet("lastname");
		Row row = sh.getRow(0);
		Cell col = row.getCell(0);
		String Lastname = col.getStringCellValue()+ranNum;
		
		
		driver.findElement(By.name("lastname")).sendKeys(Lastname);
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		
		Set<String> allid = driver.getWindowHandles();
		Iterator<String> item = allid.iterator();
		while(item.hasNext())
		{
			
			String single_wind = item.next();
			driver.switchTo().window(single_wind);
			String title = driver.getTitle();
			if(title.contains("Accounts&action"))
			{
				break;
			}
			
			
		}
		
		//fetching organozation name
		

		FileInputStream fis3=new FileInputStream("C:\\\\Users\\\\akhil\\\\OneDrive\\\\Desktop\\\\product.xlsx");
		Workbook book1=WorkbookFactory.create(fis3);
		Sheet sheetOrg = book1.getSheet("organization");
		Row row1 = sheetOrg.getRow(0);
		Cell cell1 = row1.getCell(0);
		String Orgname = cell1.getStringCellValue();
		
		//creating org

		
		driver.findElement(By.name("search_text")).sendKeys(Orgname);
		driver.findElement(By.name("search")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='"+Orgname+"']")).click();

		Set<String> allid1 = driver.getWindowHandles();
		Iterator<String> it1 = allid1.iterator();
		while(it1.hasNext())
		{
			String windowid1 = it1.next();
			driver.switchTo().window(windowid1);
			String title = driver.getTitle();
			if(title.contains("Campaigns&action"))
			{
				break;
				
			}
			
		}

		driver.findElement(By.name("button")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		
		

	}

}
