package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		 Set<String> windowid = driver.getWindowHandles();
		 ArrayList<String> ar=new ArrayList<String>(windowid);
		 driver.switchTo().window(ar.get(1));
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).click();
		
	}
}
