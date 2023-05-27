package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	WebElement button=	driver.findElement(By.xpath("//a[text()='Create new account']"));
				button.click();
				Thread.sleep(3000);
				boolean b1=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
	
	System.out.println(b1);
	if(b1)
	{
		System.out.println("radio button is enabled");
	}
	else
	{
		System.out.println("radio button is disabled");
	}
	}
}
