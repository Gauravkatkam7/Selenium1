package dropbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAlltSelectedOptionFrom_MultiSelectableListbox2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/software%20testing/automation/selenium/html%20files/multi.html");
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"1234\"]"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("Ind");
		Thread.sleep(2000);
		s1.selectByVisibleText("Pak");
		Thread.sleep(3000);
		List<WebElement> all = s1.getAllSelectedOptions();
		System.out.println(all.size());
		
		for(WebElement w2:all)
		{
			System.out.println(w2.getText());
		}
	
	
	
	
	
	
	
	
	}
}
