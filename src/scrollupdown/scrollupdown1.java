package scrollupdown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//scroll down 1st parameter 0, 2nd parameter +ve
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		//scroll down 1st parameter 0, 2nd parameter -ve

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
		
//		//scroll right 1st parameter +ve, 2nd parameter 0
//		
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(400,0)");
//		
//		//scoll left 1st arameter -ve , 2nd parameter 0
//		
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(-500,0");
		
		
	}
}
