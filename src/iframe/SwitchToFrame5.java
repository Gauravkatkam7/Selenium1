package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(3000);
		driver.switchTo().frame("frame1");
    	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]")));
		String text=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(text);
	}
}
