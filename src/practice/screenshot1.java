package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//	File dest=new File("F:\\software testing\\automation\\selenium\\screenshots\\demoqa123.jpg");
//		
//	FileHandler.copy(src, dest);
//	
//	
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String rn = RandomString.make(2);
		
		File dest=new File("F:\\software testing\\automation\\selenium\\screenshots\\amazon"+rn+".jpg");
		FileHandler.copy(src, dest);
	
	}
}
