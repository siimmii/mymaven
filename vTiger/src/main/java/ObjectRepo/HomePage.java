package ObjectRepo;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class HomePage {
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Organizations']")private WebElement organizationlink;
	@FindBy(xpath = "//a[text()='Contacts']")private WebElement contactslink;
	@FindBy(xpath = "//a[text()='Products']")private WebElement productslink; 
	@FindBy(linkText = "Campaigns")private WebElement campaignlink;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")private WebElement signoutimg;
	@FindBy(linkText = "Sign Out")private WebElement signoutlink;
	@FindBy(xpath = "//a[text()='More']")private WebElement morelink;
	
	public WebElement getCampaignlink() {
		return campaignlink;
	}
	public WebElement getSignoutimg() {
		return signoutimg;
	}
	public WebElement getSignoutlink() {
		return signoutlink;
	}

	public WebElement getOrganizationlink() {
		return organizationlink;
	}
	public WebElement getContactslink() {
		return contactslink;
	}
	public WebElement getProductslink() {
		return productslink;
	}
	public WebElement getMorelink() {
		return morelink;
	}
	
	//business logic
	
	public void campaignLink()
	{
		campaignlink.click();
	}
	public void clickorganiztionLink()
	{
		organizationlink.click();
	}
	
	public void productsLink()
	{
		productslink.click();
	}
	public void clickMoreLink(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(morelink).perform();
		
		
		// morelink.click();
	}
	public void signOUtLink(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(signoutimg).perform();
		signoutlink.click();
	}
}
