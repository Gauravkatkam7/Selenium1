package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3pending {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement w1 = driver.findElement(By.xpath("//div[@class=\"drag-box mt-4 ui-draggable ui-draggable-handle\"]"));
		WebElement w2 = driver.findElement(By.xpath("//div[@class=\"drop-box ui-droppable\"]"));
	
		Actions act=new Actions(driver);
		act.dragAndDrop(w1, w2).perform();
	
	}
}
