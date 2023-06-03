package POM_with_pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DQBookStorePage {

	@FindBy(xpath="//a[text()='Git Pocket Guide']")private WebElement book;
	WebDriver driver1;
	public DQBookStorePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void scrollToBook()
	{
		((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);",book);
	}
	
	public void clickOnBook()
	{
		book.click();
	}
}
