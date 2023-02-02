package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EmptyBrowser2 {

	public static void main(String[] args) {
	String key="webdriver.driver.chrome";
	String value="/vTiger/src/main/resources/msedgedriver.exe";
	System.setProperty(key, value);
	WebDriver driver=new EdgeDriver();
	
	}

}
