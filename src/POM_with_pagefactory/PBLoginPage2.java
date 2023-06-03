package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage2 {


	@FindBy(xpath="//a[text()='Sign in']")private WebElement signIn;
	
	public PBLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInBtn()
	{
		signIn.click();
	}
	
}
