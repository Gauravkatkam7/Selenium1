package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://zapier.com/");
		Thread.sleep(3000);
		boolean b1=driver.findElement(By.xpath("//div[@class='css-1dnpifr-AccountActions__signupButton']")).isEnabled();
		System.out.println(b1);
		if(b1)
		{
			System.out.println("giver button is enabled");
		}
		else
		{
			System.out.println("given button is disabled");
		}
	}
}
