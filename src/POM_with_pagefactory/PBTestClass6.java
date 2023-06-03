package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBTestClass6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		PBloginPage6 login=new PBloginPage6(driver);
		login.clickPBloginPage6SignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage6 mobnum=new PBMobNumPage6(driver);
		mobnum.inpPBMobNumPage6mobNum();
		mobnum.clickPBMobNumPage6signInWithPwd();
		Thread.sleep(2000);
		
		PBPasswordPage6 pwd=new PBPasswordPage6(driver);
		pwd.inpPBPasswordPage6pwd();
		pwd.clickPBPasswordPage6signIn();
		Thread.sleep(2000);
		
		PBHomePage6 home=new PBHomePage6(driver);
		home.openDDOptionPBHomePage6MyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage6 myacc=new PBMyAccPage6(driver);
		myacc.clickPBMyAccPage6myProfile();
		Thread.sleep(2000);
		
		PBProfilePage6 profile=new PBProfilePage6(driver);
		profile.swithToChildBrowser();
		profile.verifyPBProfilePage6FullName();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
