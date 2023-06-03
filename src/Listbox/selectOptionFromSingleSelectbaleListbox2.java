package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectOptionFromSingleSelectbaleListbox2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		Thread.sleep(3000);
		Select s1=new Select(w1);
//		s1.selectByVisibleText("Baby");
//		s1.selectByIndex(5);
		s1.selectByValue("search-alias=stripbooks-intl-ship");
				
	
	
	}
}
