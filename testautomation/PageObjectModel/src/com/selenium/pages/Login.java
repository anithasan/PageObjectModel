/**
 * 
 */
package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author ANITHASN
 *
 */
public class Login {

	private WebDriver driver = null;
	
	@FindBy(name="log")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="wp-submit")
	private WebElement login;
	
	public void setUserName(String usernameDate)
	{
		username.sendKeys(usernameDate);
		
	}
	public void setPassword(String passwordData)
		{
		password.sendKeys(passwordData);
	}
	public HomePage clickLogin(){
		
		login.click();
		
		HomePage h = new HomePage(driver);
		
		return h;
	}
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

