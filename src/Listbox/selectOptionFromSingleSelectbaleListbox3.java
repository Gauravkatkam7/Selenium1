package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectOptionFromSingleSelectbaleListbox3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.com/?=one-key-onboarding-dialog");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Cars']")).click();
		Thread.sleep(3000);
	WebElement w1=	driver.findElement(By.xpath("//select[@class=\"uitk-field-select\"]"));
	Select s1=new Select(w1);
	//s1.selectByVisibleText("12:45 am");
	s1.selectByIndex(7);
	
	
	}
}
