package amazonAutomation.AMZProject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage 
{
	Page page;
	Locator accountandlist;
	Locator Signin;
	Locator Signout;

	
	public HomePage(Page page)
	{
		this.page=page;
		page.waitForTimeout(2000);
		accountandlist=page.locator("//span[@class=\"nav-line-2 \"]");
		Signin = page.locator("#nav-flyout-ya-signin");
		Signout = page.locator("#nav-item-signout");		
	}
	
	public void AccountandlistonHover()
	{
		page.waitForTimeout(2000);
		accountandlist.hover();
		
	}
	
	public void ClickonSignin()
	{
		Signin.click();
	}
	
	public void ClickonSignout()
	{
		Signout.click();
	}

}
