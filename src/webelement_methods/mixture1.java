package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
   WebElement w1=driver.findElement(By.xpath("//input[@name='email']"));
		w1.sendKeys("gaurav");
		Thread.sleep(2000);
		String s1=w1.getAttribute("value");
	System.out.println(s1);
	w1.clear();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("katkam");
	Thread.sleep(2000);
WebElement w2=driver.findElement(By.xpath("//button[@value='1']"));
	w2.getText();
	Thread.sleep(3000);
	boolean b1=w2.isEnabled();
	System.out.println(b1);
	if(b1)
	{
		System.out.println("button is enabled");
	}
	else
	{
		System.out.println("button is disabled");
	}
boolean b2=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	System.out.println(b2);
	if(b2)
	{
		System.out.println("image is displayed");
	}
	else
	{
		System.out.println("mage is not displayed");
	}
	Thread.sleep(2000);

	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	boolean b3=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
	System.out.println(b3);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='1']")).click();
	Thread.sleep(3000);
boolean b0=	driver.findElement(By.xpath("//input[@value='1']")).isSelected();
	System.out.println(b0);
	if(b0)
	{
		System.out.println("radio botton is enabled");
	}
	else
	{
		System.out.println("radio button is disabled");
	}
	}
}
