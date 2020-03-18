package com.bookmyshow.pom.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bookmyshow.pom.base.BasePage;
import com.bookmyshow.pom.testcases.base.BaseTest;
import com.bookmyshow.pom.testcases.base.ThreadLocalDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileElement;

public class MovieTicketBooking extends BaseTest  {
	

	
	public static void SelectEngLang(ExtentTest test) throws Exception{
		//test.log(LogStatus.INFO, "click on Letsgo");
		BasePage.click("Letsgo",test,(ThreadLocalDriver.getTLDriver()));
		
		/*test.log(LogStatus.INFO, "click on Letsgo");
		BasePage.click("Letsgo",test);*/
		
		test.log(LogStatus.INFO, "click on Skip");
		BasePage.click("Skip",test,(ThreadLocalDriver.getTLDriver()));
		
		/*test.log(LogStatus.INFO, "click on Allow");
		BasePage.click("Allow",test, driver);*/
		Thread.sleep(5000);
		
		try {
			if(driver.findElement (By.xpath("//android.widget.Button[@text='DENY']")) != null){	
			 	
				BasePage.click("Deny",test,(ThreadLocalDriver.getTLDriver()));
			}
		
		} catch (Exception e) {
			test.log(LogStatus.INFO, "Click on submit");
			BasePage.click("ALLOW",test, (ThreadLocalDriver.getTLDriver()));
			//e.printStackTrace();
			Thread.sleep(5000);
			
		}
		
	}
	
	public static void Movies(ExtentTest test) throws Exception {
		/*WebElement ele ;33
		ele= (ThreadLocalDriver.getTLDriver()).findElement(By.id("com.bt.bms:id/et_search"));
		ele.click();
		ele.sendKeys("Chittoor");*/
		BasePage.click("Banglore",test, (ThreadLocalDriver.getTLDriver()));
		Thread.sleep(5000);
		WebElement searchBar ;
		WebDriverWait wait = new WebDriverWait((ThreadLocalDriver.getTLDriver()), 10);
		  searchBar = (ThreadLocalDriver.getTLDriver()).findElement((By.id("com.bt.bms:id/et_search")));
	    //wait.until(ExpectedConditions.visibilityOf(searchBar));
	    System.out.println("Chittoor");
	    searchBar.sendKeys("Chittoor");
		
		
		/*WebElement searchBar ;
		 searchBar = (ThreadLocalDriver.getTLDriver()).findElement(By.id("com.bt.bms:id/et_search"));
		 searchBar.click();
		 searchBar.sendKeys("Chittoor");*/
		
	/*	try {
		    Thread.sleep(5000);
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    MobileElement searchBar = (MobileElement) driver.findElement(By.id("com.bt.bms:id/et_search"));
		    wait.until(ExpectedConditions.visibilityOf(searchBar));
		    searchBar.sendKeys("Chittoor");
		    List<WebElement> listOfCities = driver.findElements(By.id("com.bt.bms:id/location_other_region_name"));
		    for (WebElement cityName : listOfCities) {
		        if (cityName.getText().equalsIgnoreCase("Chittoor")) {
		            cityName.click();
		            break;
		        }
		    }
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}*/
		
		
		Thread.sleep(5000);
		test.log(LogStatus.INFO, "click on Movies");
		BasePage.click("Movies",test, (ThreadLocalDriver.getTLDriver()));
		
	    test.log(LogStatus.INFO, "Click on search url");
	    BasePage.click("searchurl",test, (ThreadLocalDriver.getTLDriver()));
	   
	}
	
	public static void EnterMovieName(ExtentTest test) throws Exception {

	    test.log(LogStatus.INFO, "Enter the URL");
	    BasePage.enterText("searchurl1", "Enterurl1",test,(ThreadLocalDriver.getTLDriver()));
	    
	    Thread.sleep(2500);
	    test.log(LogStatus.INFO, "Click on clickOnMovie");
	    BasePage.click("clickOnMovie",test,(ThreadLocalDriver.getTLDriver()));
		}
	
	public static void EnterSecondMovieName(ExtentTest test) throws Exception {
		
	    test.log(LogStatus.INFO, "Enter the URL");
	    BasePage.enterText("searchurl1", "Enterurl",test,(ThreadLocalDriver.getTLDriver()));
	    
	    Thread.sleep(2500);
	    test.log(LogStatus.INFO, "Click on clickOnMovie");
	    BasePage.click("clickOnMovie",test,(ThreadLocalDriver.getTLDriver()));
		}
	
	public static void Book(ExtentTest test) throws Exception {
		Thread.sleep(2500); 
		 test.log(LogStatus.INFO, "click on book the ticket");
		 BasePage.click("Book",test,(ThreadLocalDriver.getTLDriver()));
		 Thread.sleep(2500);
		}

	public static void DateTime(ExtentTest test) throws Exception {
		  
		  test.log(LogStatus.INFO, "click on the date");
		  BasePage.click("Date",test,(ThreadLocalDriver.getTLDriver()));
		  
		  Thread.sleep(1500);
		  test.log(LogStatus.INFO, "Select the Time as 10:00 PM");
		  BasePage.click("Time",test,(ThreadLocalDriver.getTLDriver()));
		}

	public static void Tc(ExtentTest test) throws Exception {
		  
		  test.log(LogStatus.INFO, "Click on Accept");
		  BasePage.click("Accept",test,(ThreadLocalDriver.getTLDriver()));
		}

	public static void Selecttheseats(ExtentTest test) throws Exception {
	
		  test.log(LogStatus.INFO, "Select the number of seats as 2 and click to select the seats");
		  BasePage.click("SelectSeats",test,(ThreadLocalDriver.getTLDriver()));
		  
		  test.log(LogStatus.INFO, "Select the seats");
		  BasePage.click("seats",test,(ThreadLocalDriver.getTLDriver()));
		  
		  test.log(LogStatus.INFO, "click on pay");
		  BasePage.click("pay2",test,(ThreadLocalDriver.getTLDriver()));
		}
	
	public static void Selecttheseats1(ExtentTest test) throws Exception {
		
		  test.log(LogStatus.INFO, "Select the number of seats as 2 and click to select the seats");
		  BasePage.click("SelectSeats",test,(ThreadLocalDriver.getTLDriver()));
		  
		  test.log(LogStatus.INFO, "Select the seats");
		  BasePage.click("seats1",test,(ThreadLocalDriver.getTLDriver()));
		  
		  test.log(LogStatus.INFO, "click on pay");
		  BasePage.click("pay2",test,(ThreadLocalDriver.getTLDriver()));
		}

	public static void Details(ExtentTest test) throws Exception {	  
		 		  
	  
		 test.log(LogStatus.INFO, "Enter your email id ");
		 BasePage.enterText("Epath", "Email",test,(ThreadLocalDriver.getTLDriver()));
		 
		 test.log(LogStatus.INFO, "Enter the mobile number");
		 BasePage.enterText("Npath", "number",test,(ThreadLocalDriver.getTLDriver()));
		 
		 /*test.log(LogStatus.INFO, "click on pay");
		  BasePage.click("DoneM",test,driver);	*/
		 
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);		 
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 test.log(LogStatus.INFO, "click on pay");
		  BasePage.click("Done",test,(ThreadLocalDriver.getTLDriver()));
		 
	}
	
	public static void Details1(ExtentTest test) throws Exception {	  
		  
		  
		 test.log(LogStatus.INFO, "Enter your email id ");
		 BasePage.enterText("Epath", "Email",test,(ThreadLocalDriver.getTLDriver()));
		 
		 test.log(LogStatus.INFO, "Enter the mobile number");
		 BasePage.enterText("Npath", "number",test,(ThreadLocalDriver.getTLDriver()));		 
		 
		/* test.log(LogStatus.INFO, "click on pay");
		  BasePage.click("DoneM1",test,driver);	*/
		 
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 test.log(LogStatus.INFO, "click on pay");
		  BasePage.click("Done",test,(ThreadLocalDriver.getTLDriver()));
		 
	}
	

	
}
