package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseleftClick2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		WebElement w1 = driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]"));
	
		Actions act=new Actions(driver);
		
		act.click(w1).perform();
		
		WebElement w2 = driver.findElement(By.xpath("//li[@class=\"font12 blackText wrapFilter  \"]"));
	
		act.click(w2).perform();
	
	
	
	}
}
