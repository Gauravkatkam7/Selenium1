package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectablelistbox {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement all = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s1=new Select(all);
		s1.selectByVisibleText("Mar");
		
		String text=s1.getFirstSelectedOption().getText();
		System.out.println(text);
		
		 List<WebElement> alloptions = s1.getOptions();
		// ArrayList<String>ar = new ArrayList<>();
	
		 TreeSet<String> tr=new TreeSet<>();
		 for(WebElement s2:alloptions)
		 {
			String text1=s2.getText();
			tr.add(text1);
			// ar.add(text1);
		 }
		// Collections.sort(ar);
		// System.out.println(ar);
		 System.out.println(tr);
		 
		 boolean multiple=s1.isMultiple();
		 if(multiple)
		 {
			 System.out.println("listbox is multiple");
		 }
		 else
		 {
			 System.out.println("listbox is not multiple");
		 }
	}

}
