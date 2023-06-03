package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		PBLoginPage5 login=new PBLoginPage5(driver);
		login.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage5 mobnum=new PBMobNumPage5(driver);
		mobnum.enterMobNum();
		mobnum.clickOnSignInWithPwd();
		Thread.sleep(2000);
		
		PBPasswordPage5 pwd=new PBPasswordPage5(driver);
		pwd.enterPwd();
		pwd.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBHomePage5 home=new PBHomePage5(driver);
		home.openDropDownOptions();
		Thread.sleep(1000);
		
		PBMyAccPage5 myacc=new PBMyAccPage5(driver);
		myacc.clickOnMyProfileBtn();
		Thread.sleep(2000);
		
		PBProfilePage5 profile=new PBProfilePage5(driver);
		profile.switchToChildBrowser();
		profile.verifyName();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
