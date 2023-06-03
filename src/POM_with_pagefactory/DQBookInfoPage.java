package POM_with_pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DQBookInfoPage {

	@FindBy(xpath="//button[text()='Add To Your Collection']")private WebElement addToYourCollection;
	@FindBy(xpath="//span[text()='Profile']") private WebElement profile;
	
	WebDriver driver1;
	public DQBookInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void scrollToaddToYourCollectionBtn()
	{
		((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);",addToYourCollection);
	}
	public void clickOnaddToYourCollectionBtn()
	{
		addToYourCollection.click();
	}
	public void handlePopup()
	{
		Alert al = driver1.switchTo().alert();
		al.accept();
	}
	
	public void clickOnProfileBtn()
	{
		profile.click();
	}






}
