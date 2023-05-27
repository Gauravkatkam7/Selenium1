package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement w1 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
	
		WebElement w2 = driver.findElement(By.xpath("//ol[@class=\"field14 ui-droppable ui-sortable\"]"));
	
		Actions act=new Actions(driver);
		act.dragAndDrop(w1, w2).perform();
	
	}
}
