package com.pepboys.automation;



import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MakeAnAppointment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.pepboys.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	   
	    try{   
	    	driver.get(baseUrl); 
	    	//driver.get(baseUrl); 
	    	
	        
	        Set<String> availableWindows = driver.getWindowHandles(); 
	        if (!availableWindows.isEmpty()) { 
	             for (String windowId : availableWindows) {
	                  String switchedWindowTitle=driver.switchTo().window(windowId).getTitle();
	                  System.out.println("Window Title:"+switchedWindowTitle);
	              } 
	         } 
	    	

	    	driver.findElement(By.xpath(".//*[@id='spot-b']/div/a")).sendKeys(Keys.ENTER); 
	    	
	    	//driver.findElement(By.xpath("//a[contains(@href,'/eserve/appointment?iCID=tile-b_11-24-2014_make-an-appointment_eserve:appointment_button')")).click(); 
	        
	    	//modal div http://www.w3schools.com/howto/howto_css_modals.asp
	        //driver.findElement(By.xpath(".//*[@id='locationContainer']/div/div/div[3]/div/button")).click();
	    	driver.findElement(By.xpath(".//*[text()[contains(.,'Select a Different Location')]]")).click();
	    	driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div[3]/div/div[1]/div[2]/button")).click();
             
	    	//sometimes dont work..so sleeping before searching for the add vechicle
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath(".//*[@id='vehicleContainer']/div/div/div/div/button")).sendKeys(Keys.ENTER);
	    	Thread.sleep(5000);    	
	    	Select dropdown = new Select(driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div[2]/div/select[1]"))); 
	    	dropdown.selectByValue("2010");
	    	Select dropdown1 = new Select(driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div[2]/div/select[2]")));
	    	dropdown1.selectByValue("HONDA");
	    	Select dropdown2 = new Select(driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div[2]/div/select[3]")));
	    	dropdown2.selectByValue("CIVIC");
	    	Select dropdown3 = new Select(driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div[2]/div/select[4]")));
	    	dropdown3.selectByValue("4-1799 1.8L SOHC");
	    	
	    	driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div[2]/div/div/button[1]")).click();
	    	
	    	//driver.findElement(By.xpath(".//*[@id='appointment']/div[3]/div[1]/button")).sendKeys(Keys.ENTER);
	    	    	
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//Button[.='Continue without selecting a Service']")).sendKeys(Keys.ENTER);
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath(".//*[@id='datePickerAjaxContainer']/div[2]/div[5]/div[2]/div[13]/div/span/span")).click();//popup sometimes
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath(".//*[@id='tab2']/div[2]/div[2]/div/div/button")).sendKeys(Keys.ENTER);
	    	driver.findElement(By.id("firstName")).clear();
	        driver.findElement(By.id("firstName")).sendKeys("anitha");
	        driver.findElement(By.id("lastName")).clear();
	        driver.findElement(By.id("lastName")).sendKeys("sanjeeva");
	        driver.findElement(By.id("emailAddress")).clear();
	        driver.findElement(By.id("emailAddress")).sendKeys("aninag@gmail.com");
	        driver.findElement(By.id("contactPhoneNumber")).clear();
	        driver.findElement(By.id("contactPhoneNumber")).sendKeys("3144322651");
	        driver.findElement(By.id("remindByEmail1")).click(); 	
	        Thread.sleep(3000);
	        
	     }catch(Exception e)
	     //error message will be printed in the out console
	     {
	    	System.out.println(e.getMessage());    	e.printStackTrace(System.out);
	    	driver.close();
	     }
		
	        //System.out.println(tagName);
	        driver.close();
	        System.exit(0);
	    	
	    	
	    
	}
	


}
