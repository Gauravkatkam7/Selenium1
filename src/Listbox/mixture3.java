package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mixture3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		Thread.sleep(3000);
		Select s1=new Select(w1);
		Thread.sleep(3000);
		s1.selectByVisibleText("Audi");
		s1.selectByVisibleText("Volvo");
		s1.selectByVisibleText("Opel");
		String first = s1.getFirstSelectedOption().getText();
		System.out.println(first);
	
	
	}
}
