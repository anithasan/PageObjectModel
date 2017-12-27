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
public class HomePage {

	WebDriver driver = null;
	
	
	@FindBy(xpath="//*[@id='headline']/div/ul/li[2]/a")
	private WebElement logoutLink;
	
	public boolean verifyLogoutlink()
	{
		Boolean result = false;
		result = logoutLink.isDisplayed();
		
		return result;
	}
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
