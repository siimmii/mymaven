package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_utility.ExcelUtility;
import Generic_utility.FileUtility;
import Generic_utility.JavaUtility;

public class CreateContact {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileUtility f=new FileUtility();
		String URL = f.getKeyAndValue("url");
		String USERNAME = f.getKeyAndValue("username");
		String PASSWORD = f.getKeyAndValue("password");
		driver.get(URL);
		//login
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		//random
		JavaUtility j=new JavaUtility();
		int ranNum = j.getRandomNum();
		
		
		//clicking on more
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.name("Sales Order")).click();
		driver.findElement(By.xpath("//img[@alt='Create Sales Order...']")).click();
	
		
		ExcelUtility ex=new ExcelUtility();
		String ContactName = ex.getExcelData("contactname", 0, 0)+ranNum;
		driver.findElement(By.xpath("(//img[@alt='Select'])[3]")).click();
		driver.findElement(By.id("search_txt")).sendKeys(ContactName);
	}

}
