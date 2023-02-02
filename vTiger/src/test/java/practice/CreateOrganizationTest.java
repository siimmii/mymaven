package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.ExcelUtility;
import Generic_utility.FileUtility;
import Generic_utility.JavaUtility;
import ObjectRepo.HomePage;
import ObjectRepo.Login_page;
import ObjectRepo.OrganizationCreatePage;
import ObjectRepo.ValidationAndVerificationPage;

public class CreateOrganizationTest extends BaseClass{
	//public static void main(String[] args) throws Throwable {
		//WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		//FileInputStream fis=new FileInputStream("src/test/resources/vtiger.properties");
		//Properties pro=new Properties();
		//pro.load(fis);
		//String URL=pro.getProperty("url");
		//String USERNAME=pro.getProperty("username");
		//String PASSWORD=pro.getProperty("password");
	
	@Test(groups = "regression")
		public void createOrganization() throws Throwable
		{
		/*FileUtility flib=new FileUtility();
		String URL=flib.getKeyAndValue("url");
		String USERNAME=flib.getKeyAndValue("username");
		String PASSWORD=flib.getKeyAndValue("password");
		driver.get(URL);
		
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
		//WebDriver driver = new EdgeDriver();
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
		//driver.findElement(By.linkText("Organizations")).click();
		
		
		OrganizationCreatePage o=new OrganizationCreatePage(driver);
		o.clickOnOrganiztionImage();
		o.organiztionNameTextField(OrgName);
		o.saveOrgname();
		//String simi = driver.findElement(By.xpath("span.dvHeaderText")).getText();
		//ValidationAndVerificationPage v=new ValidationAndVerificationPage(driver);
		//v.organizationalValidation(driver, OrgName);
		//validation
		// String sim = driver.findElement(By.xpath("//*[@id=\"dtlview_Organization Name\"]")).getText();
		//System.out.println(sim);
		/*String actdata = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
		//System.out.println(actdata);
		System.out.println(OrgName);
				if(actdata.contains(OrgName))
		{
			System.out.println("Validation Pass");
		}
		else
		{
			System.out.println("Validation FAil");
		}
		
		//driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		//driver.findElement(By.name("accountname")).sendKeys(OrgName);
		//driver.findElement(By.name("button")).click();
		
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();

		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();*/
}
	@Test
	public void method2()
	{
		System.out.println("method two running");
	}
}
