package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot12 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File dest=new File("F:\\software testing\\automation\\selenium\\screenshots\\instagram.jpg");
		
		FileHandler.copy(src, dest);
	
	
	
	
	
	
	}
}
