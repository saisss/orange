package com.orangeHRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHRM.qa.base.Testbase;

public class RegisterPage extends Testbase {
	boolean flag;
	
	@FindBy(name="email")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="confirmPassword")
	WebElement cfmPwd;
	
	@FindBy(name="register")
	WebElement register;
	
	@FindBy(xpath="//a[text()='SIGN-OFF']")
	WebElement lnkSignOff;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean register(String UN,String Pwd)
	{
		UserName.sendKeys(UN);
		Password.sendKeys(Pwd);
		cfmPwd.sendKeys(Pwd);
		register.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("WaitTime")));
		wait.until(ExpectedConditions.visibilityOf(lnkSignOff));
		
		if(lnkSignOff.isDisplayed())
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
		
	}



}
