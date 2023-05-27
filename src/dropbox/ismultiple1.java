package dropbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		
		WebElement w1=driver.findElement(By.xpath("//select[@name=\"cars\"]"));
		Thread.sleep(3000);
		Select s1=new Select(w1);
		boolean b1=s1.isMultiple();
		System.out.println(b1);
		
		Thread.sleep(3000);
		
		WebElement w2=driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
		Thread.sleep(3000);
	Select s2=new Select(w2);
	boolean b2=s2.isMultiple();
	System.out.println(b2);
	}
}
