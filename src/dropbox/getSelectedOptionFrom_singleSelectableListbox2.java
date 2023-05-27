package dropbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getSelectedOptionFrom_singleSelectableListbox2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s1=new Select(w1);
		String s2=s1.getFirstSelectedOption().getText();
		System.out.println(s2);
	
	
	}
}
