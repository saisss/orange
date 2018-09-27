package com.orangeHRM.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.qa.base.Testbase;

public class LoginPage extends Testbase{

	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='SIGN-ON']")
	WebElement lnkSIGNON;
	
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement lnkREGISTER;
	
	@FindBy(xpath="//a[text()='SUPPORT']")
	WebElement lnkSUPPORT;
	
	@FindBy(xpath="//a[text()='CONTACT']")
	WebElement lnkCONTACT;
	
	@FindBy(xpath="//img[@alt='Mercury Tours']")
	WebElement imgMercury;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//UserName
	public boolean VerifyUN()
	{
		return userName.isDisplayed();
	}
	
	//Password
	public boolean VerifyPwd()
	{
		return password.isDisplayed();
	}
	
	//Login button
	public boolean VerifybtnLogin()
	{
		return btnLogin.isDisplayed();
	}
	
	//lnkSIGNON
	public boolean VerifylnkSIGNON()
	{
		return lnkSIGNON.isDisplayed();
	}
	
	//lnkREGISTER
	public boolean VerifylnkREGISTER()
	{
		return lnkREGISTER.isDisplayed();
	}
	
	//lnkSUPPORT
	public boolean VerifylnkSUPPORT()
	{
		return lnkSUPPORT.isDisplayed();
	}

	//lnkCONTACT
	public boolean VerifylnkCONTACT()
	{
		return lnkCONTACT.isDisplayed();
	}
	
	//imgMercury
	public boolean VerifyimgMercury()
	{
		return imgMercury.isDisplayed();
	}
	
	//Click on any link
	public void ClickonElement(String XpathValue)
	{
		switch(XpathValue)
		{
			case "reg":
				lnkREGISTER.click();
				break;
			case "signon":
				lnkSIGNON.click();
				break;
		}
		
		

	}
	
}
