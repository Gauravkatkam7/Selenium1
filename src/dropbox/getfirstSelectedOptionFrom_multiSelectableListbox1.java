package dropbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstSelectedOptionFrom_multiSelectableListbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"cars\"]"));
	Select s1=new Select(w1);
	s1.selectByVisibleText("Opel");
	Thread.sleep(3000);
	s1.selectByIndex(3);
	Thread.sleep(2000);
	s1.selectByValue("volvo");
	Thread.sleep(3000);
	String s2=s1.getFirstSelectedOption().getText();
	System.out.println(s2);
	
	}
}
