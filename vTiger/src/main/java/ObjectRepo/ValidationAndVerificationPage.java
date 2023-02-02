package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationAndVerificationPage {
	public ValidationAndVerificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//@FindBy(css="span.dvHeaderText")private WebElement actualOrganizationdata;
	@FindBy(css="span.dvHeaderText") private WebElement actualOrganizationData;
	
	
	public WebElement getActualOrganizationdata() {
		return actualOrganizationData;
	}
	
	public void organizationalValidation(WebDriver driver,String data)
	{
		String actData=actualOrganizationData.getText();
		if(actData.contains(data))
		{
			
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
}
