package com.inetbanking.TestCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import com.inetbanking.PageObjects.LoginPage;



public class TC_LoginTest_001 extends baseClass {
	@Test
	public void LoginTest() throws IOException
	{
		
		logger.info("URL is Opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("UserName is Entered");
		lp.setPassword(password);
		logger.info("Password is Entered");
		lp.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
				{
			Assert.assertTrue(true);
			logger.info("Login is Passed");
				}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login is Failed");
		}
	}

}
