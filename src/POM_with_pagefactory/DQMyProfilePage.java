package POM_with_pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DQMyProfilePage {

	@FindBy (xpath="//button[text()='Delete All Books']")private WebElement deleteAllBooks;
	@FindBy(xpath="//button[text()='OK']")private WebElement ok;
	@FindBy(xpath="//button[text()='Log out']")private WebElement logOut;
	WebDriver driver1;
	public DQMyProfilePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void scrollToDeleteAllBooksBtn()
	{
		((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);",deleteAllBooks);
	}
	
	public void clickOnDeleteAllBooksBtn()
	{
		deleteAllBooks.click();
	}
	public void clickOnOkButton()
	{
		ok.click();
	}
	public void handleTheAlertPopup()
	{
		Alert al = driver1.switchTo().alert();
		al.accept();
	}
	public void scrollToLogOutButton()
	{
		((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);",logOut);
	}
	public void clickOnLogOutButton()
	{
		logOut.click();
	}




}
