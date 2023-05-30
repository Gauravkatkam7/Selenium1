package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrowsize6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(2000);
		
		int size = driver.findElements(By.xpath("//div[@class=\"rt-tbody\"]/div")).size();
		System.out.println(size);
	}

}
