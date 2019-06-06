package com.firstproject.testCases;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.firstproject.pageObjects.LoginPageObject;

public class LoginPageTestCase extends BaseClass
{
	@Test
	public void LoginTC_CorrectUN_PWD() throws IOException 
	{
		LoginPageObject lp = new LoginPageObject(driver);
				
		lp.setUsername(username);
		logger.info("Username Entered");
		lp.setPassword(password);
		logger.info("Password Entered");
		lp.clickLogin();
		
		if (driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")){
			Assert.assertTrue(true);
			logger.info("Login Test Successful - Positive TC");
			
		}
		else
		{
			logger.info("Enter else block after test failed");
			BaseClass.captureScreenshot(driver,"LoginTC_CorrectUN_PWD");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
			
		}		
	}

}
