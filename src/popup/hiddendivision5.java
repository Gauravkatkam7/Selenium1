package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivision5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.poptin.com/");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class=\"close-icon\"]")).click();
	}
}
