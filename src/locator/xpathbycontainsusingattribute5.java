package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontainsusingattribute5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mobikwik.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'m_spright7 m_smleft7 m_spleft7')]")).click();
		
	}
}
