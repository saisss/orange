package com.orangeHRM.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHRM.qa.base.Testbase;
import com.orangeHRM.qa.pages.LoginPage;
import com.orangeHRM.qa.pages.RegisterPage;
import com.orangeHRM.qa.util.TestUtil;

public class RegisterPageTest extends Testbase {

	RegisterPage rp;
	LoginPage lp;
	boolean status;
	String sheetName = "Users";
	
	public RegisterPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void initialize()
	{
		initialization();
		rp=new RegisterPage();
	}
	
	@Test
	public void VerifyUserRegister() throws InterruptedException
	{
		//Click on register link
		lp = new LoginPage();
		lp.ClickonElement("reg");
		
		//Thread.sleep(10000);
		status = rp.register("krishna", "krishna");
		Assert.assertTrue(status);
	}
	

	@Test(dataProvider="data")
	public void VerifymultiRegistration(String UN,String Pwd)
	{
		//Click on register link
				lp = new LoginPage();
				lp.ClickonElement("reg");
				
				//Thread.sleep(10000);
				status = rp.register(UN,Pwd);
				Assert.assertTrue(status);
	}
	
	@DataProvider(name="data")
	public Object[][] Testdata()
	{
		Object[][] data= TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	
	
	@AfterMethod
	public void close()
	{
		closeApp();
	}
}
