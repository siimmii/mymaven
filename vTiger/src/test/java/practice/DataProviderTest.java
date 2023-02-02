package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_utility.FileUtility;
import ObjectRepo.HomePage;
import ObjectRepo.Login_page;
import ObjectRepo.OrganizationCreatePage;



public class DataProviderTest {
	@Test(dataProvider ="dataProvider_Test" )
	
	public void companyDetails(String name,String phone,String email) throws Throwable
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileUtility f=new FileUtility();
		String URL = f.getKeyAndValue("url");
		String USERNAME=f.getKeyAndValue("username");
		String PASSWORD=f.getKeyAndValue("password");
		//driver.get("http://localhost:8888/");
		driver.get(URL);
		//login to vtiger using pom class
		
		Login_page login=new Login_page(driver);
		login.loginToApp(USERNAME, PASSWORD);
		
		//clicking organizaton
		HomePage home=new HomePage(driver);
		home.clickorganiztionLink();
		OrganizationCreatePage org=new OrganizationCreatePage(driver);
		org.clickOnOrganiztionImage();
		driver.findElement(By.name("email1")).sendKeys(name);
		driver.findElement(By.id("phone")).sendKeys(phone);
		driver.findElement(By.name("accountname")).sendKeys(name);
		driver.findElement(By.name("button")).click();
		driver.quit();
		Thread.sleep(3000);
		
		
	}
	@DataProvider
	public Object[][] dataProvider_Test()
	{
		Object[][] objArr=new Object[3][3];
		objArr[0][0]="AAA";
		objArr[0][1]="1234567894";
		objArr[0][2]="abc@gmail.com";
		
		objArr[1][0]="BBB";
		objArr[1][1]="1234567894";
		objArr[1][2]="abc@gmail.com";
		
		objArr[2][0]="CCC";
		objArr[2][1]="1234567894";
		objArr[2][2]="abc@gmail.com";
		return objArr;
		
	}

}
