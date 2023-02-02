package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBrowser {
public static void main(String[] args) {
	String Key="webdriver.driver.chrome";
	String Value="/vTiger/src/main/resources/chromedriver.exe";
	System.setProperty(Key, Value);
WebDriver driver=new ChromeDriver();
}
}
