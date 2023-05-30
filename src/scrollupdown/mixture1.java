package scrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://igsindia.net/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//strong[text()='Read More']")).click();
//		
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",readmore);
//		Thread.sleep(4000);
//		 driver.findElement(By.xpath("//strong[text()='Read More']")).click();
		//readmore.click();
	}
}
//((//div[@class="et_pb_section et_pb_section_8 et_section_regular"]//div)[7]//strong)[2]