package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {

	    public static void main(String[] args) 
	    {
	        
	       WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.zlti.com");
	        driver.manage().window().maximize();
	        
	        
	       List<WebElement> links = driver.findElements(By.tagName("a"));
	       System.out.println(links.size());
	       int respCode=200;
	       
	     
	       for(WebElement element:links)
	       {
	    	 String URL= element.getAttribute("href");
	       try 
	       {
             URL link=new URL(URL);
           	
           	HttpURLConnection huc = (HttpURLConnection)link.openConnection();
               
               huc.setRequestMethod("HEAD");
               
               huc.connect();
               
              respCode = huc.getResponseCode();
               
               if(respCode>=400)
               {
                   System.out.println(link+" is a broken link");
                  
               }
             
	       }
               catch(Exception e)
               {
            	   e.printStackTrace();
            	   
               }
           
           }
	       
	    }
}

