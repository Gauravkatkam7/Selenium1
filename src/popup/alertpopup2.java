package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println(text);
		
		//alert.dismiss();
		alert.accept();
		alert.accept();
	}
}
