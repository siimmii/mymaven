package Generic_utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

import io.netty.handler.codec.http.multipart.Attribute;

public class WebDriver_Utility {
	public void maximizeScreen(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
/**
 * wIt for page to load b4 identifying any synchronized element in DOM
 * 
 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
/**
 * After every action it will wait for next to perform
 * 
 */
	public void scriptTimeOut(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
	}
/**
 * used to wait for elemenr to be clicakable in GUI and check for specific element for every 500 milliseocnds
 * 
 */
	public void waitForElementWithCustomTimeout(WebDriver driver,WebElement Element, int pollingtime)
	{
		
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
	/**
	 * used to switch to any window based on window title
	 * 
	 */
	public void switchToWindow(WebDriver driver,String PartialWindowTitle)
	{
		Set<String> allid = driver.getWindowHandles();
		Iterator<String> it = allid.iterator();
		while(it.hasNext())
		{
			String wid=it.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains(PartialWindowTitle))
			{
				break;
			}
		}
		
	}
	/** used to switch alertwindow and dismiss(click on cancel button)
	 * **
	 */
	
	public void switchToAlertAndDismiss(WebDriver driver)
	{
		
		driver.switchTo().alert().dismiss();
	}
	/** used to switch alertwindow and accept(click on ok button)
	 * **
	 */
	public void switchToAlertAndAccept(WebDriver driver)
	{
		
		driver.switchTo().alert().accept();
	}
	
	
	/**
	 * used to switchTo.frame based on index
	 * 
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * used to switch to frame window based on id or name  Attribute}
	 * 
	 */
	public void switchToFrame(WebDriver driver,String id_name_Attribute)
	{
		
		driver.switchTo().frame(id_name_Attribute);
	}
	/**
	 * used to select the value from  the dropdown based on index
	 * 
	 */
	public void select(WebElement element,int index)
	{
		
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * used to select the value from the dropdown baed on text
	 * 
	 */
	
	public void select(WebElement element,String text)
	{
		
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	/** 
	 * used to place mouse cursoe on specified element
	 */
	public void mouseOverOnElemnt(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * used to right click on element
	 * 
	 */
	public void rightClickOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	public void moveByOffset(WebDriver driver,int x,int y)
	{
		Actions act=new Actions(driver);
		act.moveByOffset(x, y).click().perform();
	}
}




