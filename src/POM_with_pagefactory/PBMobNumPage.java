package POM_with_pagefactory;
//pom class 2

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage {

	@FindBy(xpath="(//input[@id=\"central-login-module-sign-mobile\"])[2]") private WebElement mobNo;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInwithPwd;
	
	public PBMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobNum()
	{
		mobNo.sendKeys("7020790545");
	}
	public void clickOnSignInWithPwd()
	{
		signInwithPwd.click();
	}












}
