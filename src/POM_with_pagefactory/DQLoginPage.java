package POM_with_pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DQLoginPage {

	@FindBy(xpath="//input[@id=\"userName\"]")private WebElement userName;
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement password;
	@FindBy(xpath="//button[text()='Login']")private WebElement login;
	WebDriver driver1;
	public DQLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void enterUserName()
	{
		userName.sendKeys("gaurav");
	}
	public void enterPassword()
	{
		password.sendKeys("Katkam@123");
	}
	public void scrollToLoginBtn()
	{
		((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);",login);
	}
	public void clickOnLoginBtn()
	{
		login.click();
	}
	
}
