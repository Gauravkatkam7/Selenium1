package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture7 {
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	boolean b1=driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).isEnabled();
	System.out.println(b1);

}
}