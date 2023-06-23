package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class rahultshettypractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//	    System.out.println("----------Radio Buttons---------");	
		
//		List<WebElement> radio = driver.findElements(By.xpath("//input[@name=\"radioButton\"]"));
//	
//		int size = radio.size();
//		
//	
//		for(WebElement s1:radio)
//		{
//			s1.click();
//			Thread.sleep(1000);
//		}
//	

//			String text = s1.getText();
//			if(text.equals(exp))
//			{
//				s1.click();
//				
//			}
//				System.out.println("----------Auto Suggestions---------");
//		
//		driver.findElement(By.xpath("//input[@placeholder=\"Type to Select Countries\"]")).sendKeys("ind");
//		Thread.sleep(2000);
//		List<WebElement> all = driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li"));
//		
//		String exp="India";
//		for(WebElement s1:all)
//		{
//			String text = s1.getText();
//			if(text.equals(exp))
//			{
//				s1.click();
//				
//			}
//		}
		
//		System.out.println("=============DropDown============");
//
//		WebElement w1 = driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
//		
//		Select s1=new Select(w1);
//		s1.selectByVisibleText("Option1");
		
		
//		System.out.println("----------Check Boxes------------");
//	
//		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(int i=0;i<=2;i++)
//		{
//			cb.get(i).click();
//		
//		}
//		
		
//		System.out.println("============switch to browser============");
//		driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
//		
//		Set<String> allid = driver.getWindowHandles();
//		ArrayList<String>ar=new ArrayList<>(allid);
//		driver.switchTo().window(ar.get(1));
//		
//		driver.findElement(By.xpath("//a[text()='Courses']")).click();
//		
//	System.out.println("===========switch to alert example============");
//	
//	driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Name\"]")).sendKeys("gaurav");
//	
//	driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
//	Thread.sleep(2000);
//	String text = driver.switchTo().alert().getText();
//	String actual = text.substring(0, 12);
//	//System.out.println(actual);
//	String exp="Hello gaurav";
//	if(exp.equals(actual))
//	{
//		Reporter.log("TC pass",true);
//	}
//	else
//	{
//		Reporter.log("TC Fail",true);
//	}
//	
//	driver.switchTo().alert().accept();

//		Reporter.log("============hide element==========",true);
//		
//		driver.findElement(By.xpath("//input[@value=\"Hide\"]")).click();
//		Thread.sleep(2000);
//		WebElement hide = driver.findElement(By.xpath("//input[@placeholder=\"Hide/Show Example\"]"));
//		if(hide.isDisplayed())
//		{
//			System.out.println("text box is displaying");
//		}
//		else
//		{
//			Reporter.log("text box is not displaying",true);
//		}
//		Thread.sleep(2000);
//		 driver.findElement(By.xpath("//input[@id=\"show-textbox\"]")).click();
//		WebElement show = driver.findElement(By.xpath("//input[@placeholder=\"Hide/Show Example\"]"));
//		if(show.isDisplayed())
//		{
//			System.out.println("text box is displaying");
//		}
//		else
//		{
//			Reporter.log("text box is not displaying",true);
//		}
		
//		Reporter.log("===========webtable==========",true);
//		
//		String instructor = driver.findElement(By.xpath("(//table[@id=\"product\"]//tr)[7]/td[1]")).getText();
//		String course = driver.findElement(By.xpath("(//table[@id=\"product\"]//tr)[7]/td[2]")).getText();
//		String price = driver.findElement(By.xpath("(//table[@id=\"product\"]//tr)[7]/td[3]")).getText();
//		
//		String actual =instructor;
//		String actual2=course;
//		String actual3=price;
//		System.out.println(actual);
//		String exp1="Rahul Shetty";
//		String exp2= "WebServices / REST API Testing with SoapUI";
//		String exp3="35";
//		
//		if(exp1.equals(actual)&&exp2.equals(actual2)&&exp3.equals(actual3))
//		{
//			Reporter.log("TC pass",true);
//		}
//		else
//		{
//			Reporter.log("TC fail",true);
//		}
		
		Reporter.log("============iframe==========");
		
		driver.switchTo().frame("iframe-name");
		WebElement js = driver.findElement(By.xpath("//a[text()='Job Support']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",js);
		Thread.sleep(2000);
		js.click();
	
		
		
		
		
		
		
		
		
	}
}
