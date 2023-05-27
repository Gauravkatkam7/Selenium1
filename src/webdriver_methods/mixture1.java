package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture1 {
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.get("https://www.primevideo.com/");
	Thread.sleep(3000);
	String s1 =driver.getTitle();
	System.out.println(s1);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();

	
}
}