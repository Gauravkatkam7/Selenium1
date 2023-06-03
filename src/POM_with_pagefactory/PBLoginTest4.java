package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		PBLoginPage4 login=new PBLoginPage4(driver);
		login.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage4 mobnum=new PBMobNumPage4(driver);
		mobnum.enterMobNum();
		mobnum.clickOnSignInWithPwdBtn();
		Thread.sleep(2000);
		
		PBPasswordPage4 pwd=new PBPasswordPage4(driver);
		pwd.enterPwd();
		pwd.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBHomePage4 home=new PBHomePage4(driver);
		home.openDropDownOptions();
		Thread.sleep(2000);
		
		PBMyAccPage4 myacc=new PBMyAccPage4(driver);
		myacc.clickOnMyProfileBtn();
		Thread.sleep(2000);
		
		PBProfilePage4 profile=new PBProfilePage4(driver);
		profile.switchToChildBrowser();
		profile.verifyFullName();
		Thread.sleep(2000);
		
		driver.quit();

	}
	
}
