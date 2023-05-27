package dropbox;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class mixture4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
	
		Select s1=new Select(w1);
		
		String rs = RandomString.make(2);
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File f1=new File("F:\\software testing\\automation\\selenium\\screenshots\\demoqa"+rs+".png");
		
		FileHandler.copy(file, f1);
		String text=s1.getFirstSelectedOption().getText();
	
		System.out.println(text);
		Thread.sleep(3000);
		
		List<WebElement> all = s1.getOptions();
		
//		TreeSet<String> tr=new TreeSet();
		ArrayList ar=new ArrayList();
		for(WebElement s2:all)
		{
			String text1=s2.getText();
			ar.add(text1);
		}
		Collections.sort(ar);
		for(Object s3:ar)
		{
			System.out.println(s3);
		}
	
	
	}
}
