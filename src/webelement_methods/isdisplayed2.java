package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		WebElement b1=driver.findElement(By.xpath("//div[@class='_2EGQY cqA0P']"));
		b1.click();
		Thread.sleep(3000);
		boolean b2=driver.findElement(By.xpath("(//img[@alt='image'])[1]")).isDisplayed();
		System.out.println(b2);
		if(b2)
		{
			System.out.println("image displayed");
		}
		else
		{
			System.out.println("image is not displayed");
		}
	}
}
