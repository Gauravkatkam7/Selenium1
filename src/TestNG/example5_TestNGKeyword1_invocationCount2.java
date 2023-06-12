package TestNG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webelement_methods.sendkeys1;

public class example5_TestNGKeyword1_invocationCount2 {

	WebDriver driver1;
	@BeforeClass
	public void openBrowserAndUrl()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver1=driver;
	}
	
	@BeforeMethod
	public void signInToPB() throws InterruptedException
	{
		driver1.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys("7020790545");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Gaurav@8382");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(2000);
	}
	@Test
	public void verifyName() throws InterruptedException
	{
		WebElement w1 = driver1.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver1);
		act.moveToElement(w1).perform();
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//span[text()=' My profile ']")).click();
		Thread.sleep(2000);
		
		Set<String> allId = driver1.getWindowHandles();
		ArrayList<String>ar=new ArrayList<>(allId);
		driver1.switchTo().window(ar.get(1));
		Thread.sleep(2000);
		WebElement w2 = driver1.findElement(By.xpath("//input[@name=\"personName\"]"));
		String actName = w1.getAttribute("value");
		String expName="gaurav katkam";
		if(expName.equals(actName))
		{
			Reporter.log("TC pass",true);
		}
		else
		{
			Reporter.log("TC fail",true);
		}
		Thread.sleep(2000);
}
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		driver1.findElement(By.xpath("//img[contains(@src,'assets/logout.svg')]")).click();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		driver1.quit();;
	}
	
}