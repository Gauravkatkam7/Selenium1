package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		
		String text = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr[3]/td[1]")).getText();
		System.out.println(text);
	
	}
}
