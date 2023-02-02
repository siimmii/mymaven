package ObjectRepo;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignCreationPage {
	public CampaignCreationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name = "Campaigns")private WebElement campaignlink;
	@FindBy(xpath="//img[@alt='Create Campaign...']")private WebElement campaignimagelink;
	@FindBy(name = "campaignname")private WebElement campaignnametextfiled;
	@FindBy(name = "button")private WebElement savebutton;
	
	public WebElement getSavebutton() {
		return savebutton;
	}
	public WebElement getCampaignnametextfiled() {
		return campaignnametextfiled;
	}
	public WebElement getCampaignlink() {
		return campaignlink;
	}
	public WebElement getCampaignimagelink() {
		return campaignimagelink;
	}
	//business logics
	public void clickCampaignLink()
	{
		campaignlink.click();
	}
	public void clickCampaignImagelink()
	{
		campaignimagelink.click();
	}
	public void camapignTextField(String CampaigName)
	{
		campaignnametextfiled.sendKeys(CampaigName);
	}
	
	public void clickSave()
	{
		savebutton.click();
	}
}
