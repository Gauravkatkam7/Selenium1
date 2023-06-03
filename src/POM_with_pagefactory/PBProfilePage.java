package POM_with_pagefactory;
//pom class 6

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage {

	@FindBy(xpath="//input[@name=\"personName\"]")private WebElement fullName;
	WebDriver driver1;
	public PBProfilePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchToChildWindow()
	{
		Set<String> allId = driver1.getWindowHandles();
		ArrayList<String>ar=new ArrayList<String>(allId);
		driver1.switchTo().window(ar.get(1));
	}
	public void verifyFullName()
	{
		String exptext="gaurav katkam";
		String acttext = fullName.getAttribute("value");
		if(acttext.equals(exptext))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
	}
}
