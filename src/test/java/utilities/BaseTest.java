package utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest extends ListnersLogic

{
//	Playwright playwright;
//	Browser browser;
//	BrowserContext browsercontext;
//	public Page page;
	@Parameters("engine")
	@BeforeMethod
	public void launch(String nameofsearchEngine)
	{
		if(nameofsearchEngine.equals("webkit"))
		{
		playwright = Playwright.create();
		browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page = browser.newPage();
		}
		
		if(nameofsearchEngine.equals("chrome"))
		{
		playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page = browser.newPage();
		}
		
		if(nameofsearchEngine.equals("firefox"))
		{
		playwright = Playwright.create();
		browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page = browser.newPage();
		}
		page.navigate("https://www.amazon.in");
		
	}
	
	@AfterMethod
	
	public void Quit()
	{
		browser.close();
	}
	

}
