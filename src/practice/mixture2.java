package practice;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mixture2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.redbus.in/");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-message=\"Please enter a source city\"]")).sendKeys("pune");
		Thread.sleep(2000);
		List<WebElement> w1 = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		String exp="Swargate, Pune";
		for(WebElement s:w1)
		{
			String text=s.getText();
			if(text.equals(exp))
			{
				s.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@data-message=\"Please enter a destination city\"]")).sendKeys("mumbai");
		Thread.sleep(2000);
		List<WebElement> w2 = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		String exp1="Dadar, Mumbai";
		for(WebElement s1:w2)
		{
			String text1=s1.getText();
			if(text1.equals(exp1))
			{
				s1.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class=\"close-primo\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class=\"icon-close coach-close\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
	}
}
