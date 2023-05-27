package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.makemytrip.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]")).click();
	
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);
		alt.dismiss();
//		alt.accept();
//		alt.accept();
//		driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[2]")).click();
		
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
