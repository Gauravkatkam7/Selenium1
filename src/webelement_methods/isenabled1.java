package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean button =driver.findElement(By.xpath("//button[@value='1']")).isEnabled();
		System.out.println(button);
		
		if(button)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is disabled");
		}
	}
}
