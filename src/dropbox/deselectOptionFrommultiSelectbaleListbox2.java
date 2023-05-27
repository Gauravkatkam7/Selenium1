package dropbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectOptionFrommultiSelectbaleListbox2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//select[@name=\"cars\"]"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("Saab");
		Thread.sleep(2000);
		s1.selectByValue("opel");
		Thread.sleep(2000);
		s1.selectByIndex(3);
		Thread.sleep(2000);
		s1.deselectAll();
	
	
		
	
	
	
	
	}

}
