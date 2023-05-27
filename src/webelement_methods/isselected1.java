package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
boolean b1=driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
	System.out.println(b1);
	if(b1)
	{
		System.out.println("radio button is selected");
	}
	else
	{
		System.out.println("radio button is not selected");
	}



	
	}
}
