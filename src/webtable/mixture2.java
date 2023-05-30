package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		
		int size = driver.findElements(By.xpath("//table[@id=\"countries\"]//tr")).size();
		System.out.println(size);
		
//		int colsize = driver.findElements(By.xpath("//table[@id=\"countries\"]//tr[2]/td")).size();
//		System.out.println(colsize);
//		
//		String text = driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[4]/td[5]")).getText();
//		
//		System.out.println(text);
//		
		Thread.sleep(2000);
		for(int i=1;i<=5;i++)
		{
			String text1 = driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[2]/td["+i+"]")).getText();
			System.out.print(text1+" ");
		}
	

		Thread.sleep(2000);

		for(int i=1;i<=197;i++)
		{
		String text = driver.findElement(By.xpath("//table[@id=\"countries\"]//td[2]")).getText();
		System.out.println(text);
		}
	}
}
