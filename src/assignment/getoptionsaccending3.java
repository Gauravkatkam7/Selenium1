package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptionsaccending3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
	WebElement w1=	driver.findElement(By.xpath("//select[@id=\"month\"]"));
	Select s1=new Select(w1);
	List<WebElement> all = s1.getOptions();
	ArrayList<String> ar=new ArrayList();
	for(WebElement s2:all)
	{
		String g=s2.getText();
		ar.add(g);
	}
	Collections.sort(ar);
	//System.out.println(ar);
	for(String g1:ar)
	{
		System.out.println(g1);
	}
	
	
	
	
	
	
	
	}
}
