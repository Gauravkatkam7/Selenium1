package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectDate {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"sc-bxivhb hrsLPT\"]")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//text[@class='dateText']")).click();
		Thread.sleep(2000);
		

while
(driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText().contains("Sep 2024")==false)
{
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[3]")).click();
	//Thread.sleep(1000);
}
Thread.sleep(1000);

List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']"));

for(WebElement s1:allDates)
{
	
	if(s1.getText().contains("4"))
	{
		s1.click();
		break;
	}
}

}
}
