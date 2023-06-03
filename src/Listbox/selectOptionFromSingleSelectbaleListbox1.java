package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectOptionFromSingleSelectbaleListbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		
		Thread.sleep(5000);
		
		WebElement w1=driver.findElement(By.xpath("//select[@name=\"yearformat\"]"));
		Thread.sleep(3000);
		Select s=new Select(w1);
		s.selectByVisibleText("Financial Year wise");
	}
}
