package amazonAutomation.AMZProject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByLabelOptions;

public class LoginPage 

{

	Page page;
	Locator Username;
	Locator ContinueButton;
	Locator password;
	Locator SigninButton;
	
	public LoginPage(Page page)
	{
		this.page=page;
		Username = page.getByLabel("Enter mobile number or email", new GetByLabelOptions().setExact(true));
		ContinueButton = page.locator("//input[@class='a-button-input']");
		password=page.locator("//input[@name='password']");
		SigninButton = page.locator("#signInSubmit");
		
		
	}
	
	public void EnterUsername()
	{
		Username.fill("shubhams8866@gmail.com");
		
	}
	
	public void ClickonContinueButton()
	{
		ContinueButton.click();
	}
	
	public void EnterPassword()
	{
		password.fill("Shubham@123");
		
	}
	
	public void ClickonSigninButton()
	{
		SigninButton.click();
	}

}
