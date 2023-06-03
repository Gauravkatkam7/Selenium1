package POM_with_pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DQProfilePage {

	@FindBy(xpath="//button[text()='Go To Book Store']")private WebElement goToBookStore;
	WebDriver driver1;
	public DQProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void scrollToGoToBookStoreBtn()
	{
		((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);",goToBookStore);
	}
	public void clickOnGoToBookStoreBtn()
	{
		goToBookStore.click();
	}
}
