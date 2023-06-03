package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLoginPage2 login=new PBLoginPage2(driver);
		login.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage2 mobnum=new PBMobNumPage2(driver);
		mobnum.enterMobNum();
		mobnum.clickOnSignInWithPwd();
		Thread.sleep(2000);
		
		PBPasswordPage2 pwd=new PBPasswordPage2(driver);
		pwd.enterPwd();
		pwd.clickOnSignINButton();
		Thread.sleep(2000);
		
		PBHomePage2 home=new PBHomePage2(driver);
		home.openDropDownOptions();
		Thread.sleep(2000);
		
		PBMyAccPage2 myacc=new PBMyAccPage2(driver);
		myacc.clickOnMyProfile();
		Thread.sleep(2000);
		
		PBProfilePage2 profile=new PBProfilePage2(driver);
		profile.switchToChildBrowser();
		profile.verifyFullName();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
