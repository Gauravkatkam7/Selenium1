package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		Thread.sleep(3000);
boolean b1=	driver.findElement(By.xpath("//input[@value='prepaid']")).isSelected();
	System.out.println(b1);
	Thread.sleep(3000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(3000);
	boolean b2=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
	System.out.println(b2);
	}
}
