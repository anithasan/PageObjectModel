/**
 * 
 */
package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.HomePage;
import com.selenium.pages.Login;



/**
 * @author ANITHASN
 *
 */
public class LoginScenarios {
	
	@Test
	public void login_001(){
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://login.wordpress.org/");
        
        Login login = new Login(driver);
        
        login.setUserName("anithasn");
        
        login.setPassword("Rika2365***");
        
        HomePage hp = login.clickLogin();
        
        boolean result = hp.verifyLogoutlink();
        
        Assert.assertTrue(result, "Could not login to actitime");
        
        System.out.println("Login_001 -- Pass");
        		
        
        
	}

}
