package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2EGQY cqA0P']")).click();
		Thread.sleep(3000);
	WebElement radio=driver.findElement(By.xpath("//label[@class='_3M_F']"));
	Thread.sleep(3000);
	radio.click();
	Thread.sleep(3000);
	boolean b1=radio.isSelected();
	System.out.println(b1);
	if(b1) {
		System.out.println("radio button is enabled");
		
	}
	else
	{
		System.out.println("radio button is  not enabled");

	}
	
	}
}
