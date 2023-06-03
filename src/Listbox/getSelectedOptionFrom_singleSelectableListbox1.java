package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getSelectedOptionFrom_singleSelectableListbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
	WebElement w1=driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
	Thread.sleep(2000);
	Select s1=new Select(w1);
	String s2=s1.getFirstSelectedOption().getText();
	Thread.sleep(3000);
	System.out.println(s2);
	}
}
