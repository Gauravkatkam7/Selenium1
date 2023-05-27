package screenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File dest=new File("F:\\software testing\\automation\\selenium\\screenshots\\facebook2.jpg");
		FileHandler.copy(src, dest);
	}
}
