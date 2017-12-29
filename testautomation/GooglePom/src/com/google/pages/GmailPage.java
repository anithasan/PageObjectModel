/**
 * 
 */
package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author ANITHASN
 *
 */
public class GmailPage {
	
	
	String username;
	String password;
	String baseurl;
	WebDriver webdriver;
	
	
	public GmailPage(WebDriver temp){
		webdriver = temp;
		
	}
	
	
	public void setUsername(String username){
		this.username = username;
		
	}
	
	public void setPassword(String password){
		
		this.password = password;
	}
	
	public void setBaseurl(String baseurl){
		
		this.baseurl = baseurl;
	}
	
	public Boolean Login(){
		
		  try {
				if (webdriver == null || username.isEmpty() || password.isEmpty())
					return false;
			  
			    //Navigate to Google.com
			    webdriver.navigate().to(baseurl);
			    
			    webdriver.findElement(By.id("identifierId")).sendKeys(username);
			   
			    webdriver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
			      
			    webdriver.findElement(By.name("password")).sendKeys(password);
			    webdriver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();          
			    
			    //Assert on Login
			    
			    WebElement element = null;
			    
			   
			    element = webdriver.findElement(By.xpath("//a[contains(@title, 'Anitha Nagendra')]"));
			    if (element != null)
			    	return true;
			    else
			    	return false;
		  }
			    catch(Exception e)
			    {
			    	return false;
			    }
			    
	
		  }

}
