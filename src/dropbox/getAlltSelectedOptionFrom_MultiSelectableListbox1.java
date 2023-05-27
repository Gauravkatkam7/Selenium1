package dropbox;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAlltSelectedOptionFrom_MultiSelectableListbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("Volvo");
		s1.selectByIndex(3);
		Thread.sleep(3000);
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		System.out.println(allSelectedOptions.size());
		
		for(WebElement w2:allSelectedOptions)
		{
			System.out.println(w2.getText());
		}
	
	
	
	}
}
