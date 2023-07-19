package TestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider 
{
	@Test(dataProvider="loginData")
	
	public void TC1(String username,String password) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(4000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Forgotten account?']")).isDisplayed());
		Thread.sleep(4000);
		driver.quit();	
	}
	
	@DataProvider
	public Object[][] loginData()
	{
		Object[][] data=new Object[2][2]; 
		
		data[0][0]="gkatkam457@gmail.com";
		data[0][1]="Facebook457@gmail.com";
		
		data[1][0]="gaurav";
		data[1][1]="gaurav123";
		
		return data;
	}
	


}
