package campaign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCampaignWithProduct {

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
		
		Random ran=new Random();
		int ranNum=ran.nextInt(1000);
		
		

		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		FileInputStream fis2=new FileInputStream("C:\\Users\\akhil\\OneDrive\\Desktop\\product.xlsx");

		Workbook book1=WorkbookFactory.create(fis2);
	    org.apache.poi.ss.usermodel.Sheet sh1 = book1.getSheet("Sheet1");
		 Row row1 = sh1.getRow(0);
		Cell cell1 = row1.getCell(0);
		String Productname = cell1.getStringCellValue()+ranNum;
		
		driver.findElement(By.name("productname")).sendKeys(Productname);
		
		driver.findElement(By.name("button")).click();
		
		
		
		
		FileInputStream fis1=new FileInputStream("C:\\Users\\akhil\\OneDrive\\Desktop\\product.xlsx");

		Workbook book=WorkbookFactory.create(fis1);
	    org.apache.poi.ss.usermodel.Sheet sh = book.getSheet("Sheet2");
		 Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		String Campaignname = cell.getStringCellValue()+ranNum;
		
		
		driver.findElement(By.xpath("//a[text()='More']")).click();
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		driver.findElement(By.name("campaignname")).sendKeys(Campaignname);
		//driver.findElement(By.name("button")).click();
		//driver.navigate().to("http://localhost:8888/index.php?action=DetailView&module=Campaigns&record=26&parenttab=Marketing&start=");
		
		//clicking save
		driver.findElement(By.xpath("//img[@alt='Select']")).click();

		//window switching
		Set<String> allid = driver.getWindowHandles();
		Iterator<String> it = allid.iterator();
		while(it.hasNext())
		{
			String windowid = it.next();
			driver.switchTo().window(windowid);
			String title = driver.getTitle();
			if(title.contains("Products&action"))
			{
				break;
				
			}
			
		}
		
		driver.findElement(By.id("search_txt")).sendKeys(Productname);
		
		driver.findElement(By.name("search")).click();
		Thread.sleep(1000);
		//dynamic xpath
		driver.findElement(By.xpath("//a[text()='"+Productname+"']")).click();
		
		//window switching back
		
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
