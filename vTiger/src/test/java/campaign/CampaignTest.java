package campaign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GENERIC_UTILTY.BASE;
import Generic_utility.ExcelUtility;
import Generic_utility.FileUtility;
import Generic_utility.JavaUtility;
import ObjectRepo.CampaignCreationPage;
import ObjectRepo.HomePage;
import ObjectRepo.Login_page;

public class CampaignTest  extends BASE{
	
	@Test
	public void campaignTest()
	{
	
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	FileUtility f=new FileUtility();
//	String URL = f.getKeyAndValue("url");
//	String USERNAME = f.getKeyAndValue("username");
//	String PASSWORD = f.getKeyAndValue("password");
//	driver.get(URL);
//	//FileInputStream fis=new FileInputStream("src/test/resources/vtiger.properties");
//	//Properties pro=new Properties();
//	//pro.load(fis);
//	//String URL=pro.getProperty("url");
//	//String USERNAME=pro.getProperty("username");
//	//String PASSWORD=pro.getProperty("password");
//	Login_page l=new Login_page(driver);
//	l.loginToApp(USERNAME, PASSWORD);
//	//driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//	//driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//	//driver.findElement(By.id("submitButton")).click();
//	
//	
//	JavaUtility j=new JavaUtility();
//	int ranNum=j.getRandomNum();
//	
//	//Random ran=new Random();
//	//int ranNum=ran.nextInt(1000);
//	
//	//Thread.sleep(100);
//	HomePage home=new HomePage(driver);
//	home.clickMoreLink(driver);
//	CampaignCreationPage c=new CampaignCreationPage(driver);
//	c.clickCampaignLink();
//	c.getCampaignimagelink().click();
//	ExcelUtility ex=new ExcelUtility();
//	String CampaignName = ex.getExcelData("Sheet2",0,0)+ranNum;
//	c.camapignTextField(CampaignName);
//	c.clickSave();
//	home.signOUtLink(driver);
//	/*driver.findElement(By.xpath("//a[text()='More']")).click();
//	driver.findElement(By.name("Campaigns")).click();
//	driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
//	driver.findElement(By.name("campaignname")).sendKeys(Campaignname);
//	driver.findElement(By.name("button")).click();*/
//	
//	//Thread.sleep(3000);
//	//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
////	driver.findElement(By.linkText("Sign Out")).click();
//	
	
	}
}
