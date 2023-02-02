package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCreationPage {
	
	public ProductCreationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = "//img[@alt='Create Product...']")private WebElement createorganizationimage;
	@FindBy(name = "productname")private WebElement productnametexfield;
	@FindBy(name = "button")private WebElement savebutton;
	
	public WebElement getCreateorganizationimage() {
		return createorganizationimage;
	}
	public WebElement getProductnametexfield() {
		return productnametexfield;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}
	//businesslogic
	public void clickProductLinkImage()
	{
		createorganizationimage.click();
	}
	
	public void productNameTextfield(String productname)
	{
		productnametexfield.sendKeys(productname);
	}
	public void saveProductName()
	{
		savebutton.click();
	}
	
	}
