package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage2 {

	@FindBy(xpath="(//input[@id=\"central-login-module-sign-mobile\"])[2]") private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPwd;

	public PBMobNumPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobNum()
	{
		mobNum.sendKeys("7020790545");
	}
	public void clickOnSignInWithPwd()
	{
		signInWithPwd.click();
	}





}

