package com.org.pune.MavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewtoursAutomatesite {
	WebDriver driver;
  @Test
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	   driver= new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
  }
  @Test
  public void signin() {
	  
	  SignUpClass ref= new SignUpClass(driver);
	  ref.signupfuction();
	  
	  
  }
  @Test
  public void submit() {
	  SubmitClass ref= new SubmitClass(driver);
	  ref.submitfunction();
	 
	  
	  
	  
  }
   @Test
   public void teardown() {
	  
	   driver.quit();
	   
   }
}
