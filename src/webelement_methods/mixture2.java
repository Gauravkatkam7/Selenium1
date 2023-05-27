package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://givewp.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String s1=driver.getTitle();
		System.out.println(s1);
		Thread.sleep(2000);
		String s2=driver.getCurrentUrl();
        System.out.println(s2);
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        WebElement w1=driver.findElement(By.xpath("//input[@name='email']"));
        w1.sendKeys("abc");
        Thread.sleep(3000);
        w1.clear();
        Thread.sleep(3000);
        w1.sendKeys("xxxyy");
        Thread.sleep(3000);
        String s3=driver.findElement(By.xpath("//button[@value='1']")).getText();
        System.out.println(s3);
        Thread.sleep(3000);
        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(3000);
        boolean b1=driver.findElement(By.xpath("(//div[contains(@class,'xjbqb8w x78zum5')])[3]")).isEnabled();
        System.out.println(b1);
        if(b1)
        {
        	System.out.println("button is enabled");	
        	
        }
        else
        {
        	System.out.println("button is disabled");
        }
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='elementor-icon']")).click();
        Thread.sleep(3000);
        driver.quit();
        
        
	}
}
