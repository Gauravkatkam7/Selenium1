package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToMainPageFrom_ChildWindow6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		
		Set<String> allwindowid = driver.getWindowHandles();
	
		ArrayList<String>ar=new ArrayList<>(allwindowid);
		
		driver.switchTo().window(ar.get(1));
		driver.close();
		driver.switchTo().window(ar.get(2));
		String text = driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText();
		System.out.println(text);
		driver.switchTo().window(ar.get(3));
		driver.close();
		driver.switchTo().window(ar.get(0));
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		
		Set<String> windowid = driver.getWindowHandles();
		ArrayList<String>ar1=new ArrayList<>(windowid);
		driver.switchTo().window(ar1.get(2));
		String text1 = driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText();
		System.out.println(text1);

	}
}
