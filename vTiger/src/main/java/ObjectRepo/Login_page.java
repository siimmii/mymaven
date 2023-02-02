package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	//initialization
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//declaration
	@FindBy(name="user_name")private WebElement usertextfield;
	
	@FindBy(name="user_password")private WebElement userpassword;
	
	@FindBy(id="submitButton")private WebElement loginbutton;

	public WebElement getUsertextfield() {
		return usertextfield;
	}

	public WebElement getUserpassword() {
		return userpassword;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	//businesslogics
	public void loginToApp(String username,String password)
	{
		usertextfield.sendKeys(username);
		userpassword.sendKeys(password);
		loginbutton.click();
	}

}
