package Generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepo.Login_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	//comment from git humb
	//Another comment from git hub
	//viewed comment
	public WebDriver driver;
	@BeforeSuite(groups = {"smoke","regression"})
	public void BS()
	{
		System.out.println("DAtabase Connection");
	}
	
	@BeforeTest(groups = {"smoke","regression"})
	public void BT()
	{	
		System.out.println("Parallel Connection");
	}
	
	@BeforeClass(groups = {"smoke","regression"})
	public void BC() throws Throwable
	{
		
		
		FileUtility flib=new FileUtility();
		String BROWSER = flib.getKeyAndValue("browser");
		
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
		System.out.println("Launching the browser");
	}
	
	
	@BeforeMethod(groups = {"smoke","regression"})
	public void BM() throws Throwable
	{
		FileUtility flib=new FileUtility();
		String URL=flib.getKeyAndValue("url");
		String USERNAME = flib.getKeyAndValue("username");
		String PASSWORD=flib.getKeyAndValue("password");
		driver.get(URL);
		//using pom login pages
		Login_page login=new Login_page(driver);
		login.loginToApp(USERNAME, PASSWORD);
		
		
		 System.out.println("login to application");
	}

	@AfterMethod(groups = {"smoke","regression"})
	public void AM()
	{
		System.out.println("LOgout Application");
	}

	@AfterClass(groups = {"smoke","regression"})
	public void AC()
	{
		System.out.println("close browser");
	}
	
	@AfterTest(groups = {"smoke","regression"})
	public void AT()
	{
			System.out.println("Execution done");
	}
	@AfterSuite(groups = {"smoke","regression"})
	public void AS()
	{
		System.out.println("database closed");
	}
	
}

