package amazonAutomation.AMZProject;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

import utilities.BaseTest;
import utilities.ListnersLogic;
import utilities.RetryLogic;
@Listeners(ListnersLogic.class)

public class TestCase2_LoginToAmazonandLogout extends BaseTest
{
	
	@Test(retryAnalyzer=RetryLogic.class)
	public void WithValidCredentialandLogout()
	{
		HomePage homepage = new HomePage(page);
		homepage.AccountandlistonHover();
		homepage.ClickonSignin();
		page.waitForTimeout(2000);
		LoginPage loginpage = new LoginPage(page);
		loginpage.EnterUsername();
		loginpage.ClickonContinueButton();
		loginpage.EnterPassword();
		loginpage.ClickonSigninButton();
		assertThat(page).hasTitle("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		Locator searchText =page.getByLabel("Search Amazon.in");
		assertThat(searchText).isVisible();
		homepage.AccountandlistonHover();
		homepage.ClickonSignout();
		Locator SignoutText = page.locator("//div[@id='claim-collection-container']/h1");
		assertThat(SignoutText).hasText("Sign in or create account");
		
	}

}
