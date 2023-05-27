package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		boolean b1=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
		
		System.out.println(b1);
		
		if(b1) {
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is disabled");
		}
	}
}
