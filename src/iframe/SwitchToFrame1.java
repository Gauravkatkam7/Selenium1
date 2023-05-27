package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(3000);
		
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen=\"true\"]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display')]")).click();
	}
}
