package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		driver.navigate().to("https://www.mobikwik.com/");
		String s2=driver.getCurrentUrl();
		System.out.println(s2);
		String s1=driver.getTitle();
		System.out.println(s1);
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);

		driver.manage().window().minimize();
		Thread.sleep(4000);

		driver.close();


		
	}
}
