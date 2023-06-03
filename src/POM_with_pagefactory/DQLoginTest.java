package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DQLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		
		DQLoginPage login=new DQLoginPage(driver);
		login.enterUserName();
		login.enterPassword();
		login.scrollToLoginBtn();
		login.clickOnLoginBtn();
		Thread.sleep(2000);
		
		DQProfilePage profilepage=new DQProfilePage(driver);
		profilepage.scrollToGoToBookStoreBtn();
		profilepage.clickOnGoToBookStoreBtn();
		Thread.sleep(2000);
		
		DQBookStorePage bookstore=new DQBookStorePage(driver);
		bookstore.scrollToBook();
		bookstore.clickOnBook();
		Thread.sleep(2000);
		
		DQBookInfoPage bookinfo=new DQBookInfoPage(driver);
		bookinfo.scrollToaddToYourCollectionBtn();
		bookinfo.clickOnaddToYourCollectionBtn();
		Thread.sleep(2000);
		bookinfo.handlePopup();
		bookinfo.clickOnProfileBtn();
		Thread.sleep(2000);
		
		DQMyProfilePage myprofile=new DQMyProfilePage(driver);
		myprofile.scrollToDeleteAllBooksBtn();
		myprofile.clickOnDeleteAllBooksBtn();
		myprofile.clickOnOkButton();
		Thread.sleep(2000);
		myprofile.handleTheAlertPopup();
		myprofile.scrollToLogOutButton();
		myprofile.clickOnLogOutButton();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
	}
}
