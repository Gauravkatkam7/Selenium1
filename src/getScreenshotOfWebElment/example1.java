package getScreenshotOfWebElment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement w1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		File src = w1.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\software testing\\automation\\selenium\\screenshots\\img.jpg");
		
		FileHandler.copy(src, dest);
	}
}
