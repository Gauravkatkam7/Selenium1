package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.get("https://www.facebook.com/");
		Thread.sleep(300);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nikita");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("katkam");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nikita@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("nikita@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("nikita123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@title='Day']")).sendKeys("30");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("may");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("2005");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		


	}
}
