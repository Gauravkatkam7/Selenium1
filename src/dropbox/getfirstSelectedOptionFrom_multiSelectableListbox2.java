package dropbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstSelectedOptionFrom_multiSelectableListbox2 {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/software%20testing/automation/selenium/html%20files/multi.html");
	Thread.sleep(3000);
	WebElement w1=driver.findElement(By.xpath("//select[@id=\"1234\"]"));
	Select s1=new Select(w1);
	s1.selectByVisibleText("Ind");
	Thread.sleep(3000);
	s1.selectByIndex(2);
	String s2=s1.getFirstSelectedOption().getText();
	System.out.println(s2);
	}
}
