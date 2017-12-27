/**
 * 
 */
package com.wordpress.Testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.wordpress.Pages.LoginPage;

/**
 * @author ANITHASN
 *
 */
public class VerifyWordpressLogin
{
	
	@Test
	public void verifyValidLogin()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();              
        
	    
		
		LoginPage login = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		login.typeUserName();
		
		login.typePassword();
		
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.quit();
	}

}
