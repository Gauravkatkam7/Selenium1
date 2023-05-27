package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup5 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		Alert alert=driver.switchTo().alert();
		
	String text=alert.getText();
	System.out.println(text);
	
	alert.dismiss();
	
	
	
	
	
	
	}
}
