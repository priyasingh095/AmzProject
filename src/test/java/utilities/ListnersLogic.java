package utilities;

import java.nio.file.Path;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;

public class ListnersLogic implements ITestListener
{
	public static Playwright playwright;
	public static Browser browser;
	public static Page page;
	
	Date d1 = new Date();
	Date d2 = new Date(d1.getTime());
	String format = d2.toString();
	String Dateformat = format.replace(":", "");



	
	


	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		page.screenshot(new ScreenshotOptions().setPath(Path.of("C:\\Users\\priya\\eclipse-workspace\\AMZProject\\test-output\\Screenshot\\Pass\\"+result.getName()+Dateformat+".png")));
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		ITestListener.super.onTestFailure(result);
		page.screenshot(new ScreenshotOptions().setPath(Path.of("C:\\Users\\priya\\eclipse-workspace\\AMZProject\\test-output\\Screenshot\\Fail\\"+result.getName()+Dateformat+".png")));

		
	}

	
}
