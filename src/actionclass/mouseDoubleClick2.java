package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseDoubleClick2 {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement w1 = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(w1).perform();
	
	
	}
}
