package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcolsize6 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		
		int colsize = driver.findElements(By.xpath("(//div[@class=\"rt-tbody\"]//div)[11]//div/div")).size();
		System.out.println(colsize);
	
	
	}
}
