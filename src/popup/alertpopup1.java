package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		//driver.switchTo().alert().dismiss();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().accept();
	}
}
