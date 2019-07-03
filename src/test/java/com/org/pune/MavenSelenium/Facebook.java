package com.org.pune.MavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver;
  @Test
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/login");
  }
  @Test
  public void login() {
	
	  LoginFacebook face=new LoginFacebook(driver);
	  face.loginfacebookfunction();
  }
  @Test
  public void teardown() {
	  driver.quit();
	  
  }
}
