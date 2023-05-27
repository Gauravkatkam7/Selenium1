package scrollupdown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAjwscGjBhAXEiwAswQqNKRX5ct1z0E_NXiJFPmPb16A9fvC8n1nsYuEkd5a4EP3SlHVK_rcGhoCO0IQAvD_BwE");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3000)");
		
	Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-3000)");
		
		
		
	
	
	
	
	}
}
