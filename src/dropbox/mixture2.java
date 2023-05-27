package dropbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mixture2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		WebElement w1 = driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("Blue");
		Thread.sleep(3000);
		String all = s1.getFirstSelectedOption().getText();
		System.out.println(all);
		Thread.sleep(3000);
	WebElement w2=driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		Select s2=new Select(w2);
		s2.selectByIndex(0);
		s2.selectByIndex(1);
		s2.selectByIndex(2);
		s2.selectByIndex(3);
		Thread.sleep(3000);
		List<WebElement> all1=s2.getAllSelectedOptions();
		for(WebElement s3:all1)
		{
			System.out.println(s3.getText());
		}
		Thread.sleep(3000);
		s2.deselectByIndex(3);
		s2.deselectByIndex(2);
		s2.deselectByIndex(1);
		s2.deselectByIndex(0);
		Thread.sleep(3000);
		List<WebElement> all2 = s2.getOptions();
		for(WebElement g1:all2)
		{
			System.out.println(g1.getText());
		}
		s2.selectByVisibleText("Volvo");
		s2.selectByVisibleText("Saab");
		s2.selectByVisibleText("Opel");
		s2.selectByVisibleText("Audi");
		Thread.sleep(3000);
		s2.deselectAll();
		Thread.sleep(3000);
		driver.quit();
	
	}
}
