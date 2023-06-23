package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenImage {

	    public static void main(String[] args) 
	    {
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://the-internet.herokuapp.com/broken_images");
	        driver.manage().window().maximize();
	           
	       List<WebElement> links = driver.findElements(By.tagName("img"));
	       
	     
	       for(WebElement element:links)
	       {
	    	 String URL= element.getAttribute("src");
	       try 
	       {
                URL link=new URL(URL);
             	HttpURLConnection huc = (HttpURLConnection)link.openConnection();
                huc.setRequestMethod("HEAD");   
                huc.connect();
               int respCode = huc.getResponseCode();
               
                if(respCode>=400)
                {
                   System.out.println(link+" is broken image");
                  
                }
                else
                {
                	System.out.println(link+" is not broken image");
                }
             
	       }
               	catch(Exception e)
               	{
            	   e.printStackTrace();
            	   
               }
           
           }
	       
	    }
}

