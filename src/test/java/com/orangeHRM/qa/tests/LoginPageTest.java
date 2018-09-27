package com.orangeHRM.qa.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.qa.base.Testbase;
import com.orangeHRM.qa.pages.LoginPage;



public class LoginPageTest extends Testbase {

	LoginPage lp;
	boolean status;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		initialization();
		lp=new LoginPage();
		
		
	}
	

	@Test
	public void verifyElements()
	{
		verifyStatus(lp.VerifyUN());
		verifyStatus(lp.VerifyPwd());
		verifyStatus(lp.VerifylnkSIGNON());
		verifyStatus(lp.VerifylnkREGISTER());
		verifyStatus(lp.VerifylnkSUPPORT());
		verifyStatus(lp.VerifylnkCONTACT());
		verifyStatus(lp.VerifyimgMercury());
		
	}
	
	
	@AfterMethod
	public void close()
{
		closeApp();
}
	
	public void verifyStatus(boolean status)
	{
		Assert.assertTrue(status);
	}
	
}
