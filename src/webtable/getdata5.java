package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		
		String text = driver.findElement(By.xpath("(//div[@class=\"rt-tbody\"]//div)[14]")).getText();
		System.out.println(text);
	
	}
}
