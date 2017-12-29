package com.google.test;

import org.testng.annotations.Test;

import com.google.pages.GmailPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GmailPageTest {
	
GmailPage gmailPage;
WebDriver webDriver;
	
  @Test
  public void f() {
	  
	  gmailPage.setBaseurl("http://www.gmail.com");
	  gmailPage.setUsername("aninag");
	  gmailPage.setPassword("Rika2365**");
	  
	  Boolean value = gmailPage.Login();
	  
	  Assert.assertEquals(value.booleanValue(), true);
  }
 
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	  webDriver = new ChromeDriver(); 
	  webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  gmailPage = new GmailPage(webDriver);
		  
	      
      
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  webDriver.quit();
  }

}
