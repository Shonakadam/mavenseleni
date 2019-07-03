package com.org.pune.MavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubmitClass {
	By locatorofusername=By.xpath("//input[@name='userName']");
	By locatorpassword=By.xpath("//input[@name='password']");
	
	
	WebDriver driver;
	
	public SubmitClass(WebDriver driver2) {
		driver=driver2;
	}

	public void submitfunction() {
		CommanMethod c_method= new CommanMethod();
	 WebElement username=driver.findElement(locatorofusername);
	  username.sendKeys("Mona123@gmail.com");
	  
	  
	  WebElement password=driver.findElement(locatorpassword);
	  password.sendKeys("mona123");
	  
	  WebElement submit=driver.findElement(By.xpath("//input[@name='login']"));
	  submit.click();
     c_method.waitmethod(5000);
}
}