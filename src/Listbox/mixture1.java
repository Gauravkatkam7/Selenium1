package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mixture1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select s1=new Select(w1);
		s1.selectByIndex(3);
		Thread.sleep(3000);
		boolean b1=s1.isMultiple();
		System.out.println(b1);
		Thread.sleep(2000);
		driver.navigate().to("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement w2=driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		Select s2=new Select(w2);
		s2.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		s2.selectByVisibleText("Audi");
		Thread.sleep(2000);
		s2.deselectAll();
		Thread.sleep(3000);
		boolean b2=s2.isMultiple();
		System.out.println(b2);
		Thread.sleep(2000);
		driver.quit();
	
	
	
	
	
	
	}
}
