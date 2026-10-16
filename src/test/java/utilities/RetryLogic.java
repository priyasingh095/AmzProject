package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{

	int initialcount = 0;
	int retryCount = 1;

	
	@Override
	public boolean retry(ITestResult result)
	{
		if(initialcount<retryCount)
		{
			initialcount++;
			return true; //means let's retry
 
		}
		return false; // if retry method return false means dont't retry at all
		// if retry method return true - means keep retrying infinite times because of that we kept false and write return true inside the if block 
	}

}
