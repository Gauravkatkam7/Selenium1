package dropbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:demoqa.com/select-menu");
		Thread.sleep(3000);
		
		WebElement w1=driver.findElement(By.xpath("select[@id='oldSelectMenu']"));
		
		Select s1=new Select(w1);
//		s1.selectByVisibleText("Purple");
//		s1.selectByIndex(10);
		s1.selectByValue("2");
		boolean b1=s1.isMultiple();
		System.out.println(b1);
		
    	WebElement w2=driver.findElement(By.xpath("select[@name=\"cars\"]"));
		Thread.sleep(3000);
		Select s2=new Select(w2);
		s2.selectByVisibleText("Audi");
		s2.selectByVisibleText("Volvo");
		s2.selectByVisibleText("Saab");
		s2.selectByVisibleText("Opel");
		boolean b2=s2.isMultiple();
		System.out.println(b2);
		Thread.sleep(3000);
//		s2.deselectByVisibleText("Volvo");
//		s2.deselectByIndex(2);
		s2.deselectByValue("saab");
		s2.deselectAll();
		
	
		
	}
}
