/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * @author ANITHASN
 * This class  will store all the locator and methods of login page
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.xpath("//*[@id='user_pass']");
	By loginButton=By.name("wp-submit");
	
	//constructor = class name
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		driver.get("https://login.wordpress.org/");
		
	}
	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("admin");
			
		
	}
	public void typePassword()
	{
		driver.findElement(password).sendKeys("password");
	}
	
	public void clickOnLoginButton()
	{
		
		driver.findElement(loginButton).submit();
	}
}
