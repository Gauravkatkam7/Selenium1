package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected5 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.xpath("//input[@value='-1']"));
		button.click();
		boolean b1=button.isSelected();
	System.out.println(b1);
	if(b1)
	{
		System.out.println("button is enabled");
	}
	else
	{
		System.out.println("button is disabled");
	}
	}
}