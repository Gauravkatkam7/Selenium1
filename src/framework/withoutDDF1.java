package framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class withoutDDF1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys("7020790545");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"central-login-password\"]")).sendKeys("Gaurav@8382");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(2000);
		
		WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
		WebElement myprofile = driver.findElement(By.xpath("//span[text()=' My profile ']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(myacc).perform();
		Thread.sleep(2000);
		act.click(myprofile).perform();
		
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(allid);
		driver.switchTo().window(ar.get(1));
		
		String acttext = driver.findElement(By.xpath("//input[@id=\"outlined-secondary\"]")).getAttribute("value");
		
		String exptext="gaurav katkam";
		
		if(exptext.equals(acttext))
		{
			System.out.println("test script passed");
		}
		else
		{
			System.out.println("test script failed");
		}
		
		
		

	}
}
