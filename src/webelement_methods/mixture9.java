package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");

	WebElement w1=	driver.findElement(By.xpath("(//label[@class=\"css-label_c t_c\"])[3]"));
		w1.click();
		Thread.sleep(4000);
		boolean b1=w1.isSelected();
	System.out.println(b1);
	
	
	}
}
