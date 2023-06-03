package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		PBLoginPage3 login=new PBLoginPage3(driver);
		login.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage3 mobnum=new PBMobNumPage3(driver);
		mobnum.enterMobNum();
		mobnum.clickOnSignInWithPwd();
		Thread.sleep(2000);
		
		PBpasswordPage3 pwd=new PBpasswordPage3(driver);
		pwd.enterPwd();
		pwd.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBHomePage3 home=new PBHomePage3(driver);
		home.openDropDownOptions();
		Thread.sleep(2000);
		
		PBMyAccPage3 myacc=new PBMyAccPage3(driver);
		myacc.clickOnProfileBtn();
		Thread.sleep(2000);
		
		PBProfilePage3 profile=new PBProfilePage3(driver);
		profile.switchToChileBrowser();
		profile.verifyName();
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
