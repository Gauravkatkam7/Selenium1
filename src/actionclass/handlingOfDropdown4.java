package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingOfDropdown4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		WebElement w1 = driver.findElement(By.xpath("(//div[@class=\"yt-spec-touch-feedback-shape__fill\"])[3]"));
		Actions act=new Actions(driver);
		act.moveToElement(w1).perform();
	
	
	
	}
}
