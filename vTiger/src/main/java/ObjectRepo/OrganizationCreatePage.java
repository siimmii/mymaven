package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationCreatePage {
	public OrganizationCreatePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//img[@alt='Create Organization...']")private WebElement createOrganizationImage;
	@FindBy(name = "accountname")private WebElement OrganizationNameTextField;
	@FindBy(name = "button")private WebElement saveButton;
	
	
	
	public WebElement getCreateOrganizationImage() {
		return createOrganizationImage;
	}
	public WebElement getOrgnOrganizationNameTextField() {
		return OrganizationNameTextField;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//BusinessLogics
	/**
	 * this method is used for click on+ img
	 */
	public void clickOnOrganiztionImage()
	{
		createOrganizationImage.click();
	}

	/**
	 * this method is uded to pass values for organization textfield

	 */
	public void organiztionNameTextField(String Orgname)
	{
		OrganizationNameTextField.sendKeys(Orgname);
	}
	/**
	 * this method is ued to save data
	 */
	public void saveOrgname()
	{
		saveButton.click();
	}
	
	
}

