package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBloginPage login=new PBloginPage(driver);
		login.clickOnSignInButton();
		Thread.sleep(2000);
		
		PBMobNumPage mobnum=new PBMobNumPage(driver);
		mobnum.enterMobNum();
		mobnum.clickOnSignInWithPwd();
		Thread.sleep(2000);
		
		PBPasswordPage pwd=new PBPasswordPage(driver);
		pwd.enterPwd();
		pwd.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.openMyAccDropDownOptions();
		Thread.sleep(2000);
		
		PBMyAccPage myacc=new PBMyAccPage(driver);
		myacc.clickOnMyProfile();
		Thread.sleep(2000);
		
		PBProfilePage myprofile=new PBProfilePage(driver);
		myprofile.switchToChildWindow();
		myprofile.verifyFullName();
		Thread.sleep(2000);
		
		driver.quit();
	}
}