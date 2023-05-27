package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectablelistbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement multi=driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		
		Select s1=new Select(multi);
		s1.selectByVisibleText("Volvo");
		s1.selectByIndex(1);
		s1.selectByValue("opel");
		
		Thread.sleep(3000);
		s1.deselectByVisibleText("Opel");
		s1.deselectByIndex(1);
		s1.deselectByValue("volvo");
		
		s1.selectByVisibleText("Volvo");
		s1.selectByIndex(1);
		s1.selectByValue("opel");
		Thread.sleep(3000);

	List<WebElement> all = s1.getAllSelectedOptions();
	for(WebElement s2:all)
	{
		System.out.println(s2.getText());
	}
	
	s1.deselectAll();
	s1.selectByVisibleText("Audi");
	s1.selectByIndex(2);
	
	WebElement first=s1.getFirstSelectedOption();
	System.out.println(first.getText());
	
	boolean multiple=s1.isMultiple();
	if(multiple)
	{
		System.out.println("listbox is multiple");
	}
	else
	{
		System.out.println("listbox is not multiple");
	}
	
	List<WebElement> alloptions=s1.getOptions();
	ArrayList ar =new ArrayList<>();
	for(WebElement all1:alloptions)
	{
		String text=all1.getText();
		ar.add(text);
	}
	Collections.sort(ar);
	System.out.println(ar);
		
		
		
	
	
	
	
	
	
	
	
	}
}
