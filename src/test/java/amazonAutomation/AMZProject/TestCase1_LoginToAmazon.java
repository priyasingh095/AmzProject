package amazonAutomation.AMZProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.BaseTest;
import utilities.ListnersLogic;
import utilities.RetryLogic;
@Listeners(ListnersLogic.class)
public class TestCase1_LoginToAmazon extends BaseTest
{
	
	@Test(retryAnalyzer=RetryLogic.class)

	public void WithValidCredential()
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
		
		
		
	}

}
