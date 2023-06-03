package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPasswordPage2 {

	@FindBy(xpath="//input[@name=\"password\"]")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement signIn;
	
	public PBPasswordPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPwd()
	{
		pwd.sendKeys("Gaurav@8382");
	}
	
	public void clickOnSignINButton()
	{
		signIn.click();
	}
}
