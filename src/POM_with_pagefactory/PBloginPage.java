package POM_with_pagefactory;
//POM Class 1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBloginPage {

	@FindBy(xpath="//a[text()='Sign in']") private WebElement signIn;
	
	public PBloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInButton()
	{
		signIn.click();
		
	}
}
