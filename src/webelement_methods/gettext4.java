package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
       String s1=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText();
       System.out.println(s1);
	}
}
