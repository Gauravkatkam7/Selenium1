package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLoginPage1 login=new PBLoginPage1(driver);
		login.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage1 mobnum=new PBMobNumPage1(driver);
		mobnum.enterMobNo();
		mobnum.clickOnSignInWithPwd();
		Thread.sleep(2000);
		
		PBPasswordPage1 pwd=new PBPasswordPage1(driver);
		pwd.enterPwd();
		pwd.clickOnsignInBtn();
		Thread.sleep(2000);
		
		PBHomePage1 home=new PBHomePage1(driver);
		home.openMyAccDropDownOptions();
		Thread.sleep(2000);
		
		PBMyAccPage1 myacc=new PBMyAccPage1(driver);
		myacc.clickOnMyProfile();
		Thread.sleep(2000);
		
		PBProfilePage1 profile=new PBProfilePage1(driver);
		profile.switchToChildBrowser();
		profile.verifyName();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
