package com.org.pune.MavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFacebook {
	WebDriver driver;
	public LoginFacebook(WebDriver driver2) {
		driver=driver2;
	}
	public void loginfacebookfunction() {
		 WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		  username.sendKeys("neeeta@gmail.com");
		  
		  WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		  password.sendKeys("neetapassword");
		  
		  
		  WebElement loginbnt=driver.findElement(By.xpath("//button[@name='login']"));
		  loginbnt.click();
	}

}
