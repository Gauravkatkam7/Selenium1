package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage6 {

	@FindBy(xpath="(//input[@id=\"central-login-module-sign-mobile\"])[2]")private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signInWithPwd;


	public PBMobNumPage6(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpPBMobNumPage6mobNum()
	{
		mobNum.sendKeys("7020790545");
	}
	
	public void clickPBMobNumPage6signInWithPwd()
	{
		signInWithPwd.click();
	}

}
