package com.org.pune.MavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpClass {
	
	By locatorofusername=By.xpath("//input[@name='userName']");
	By locatorofpassword=By.xpath("//input[@name='password']");
	
	
	WebDriver driver;
	
	public SignUpClass(WebDriver driver2) {
		driver=driver2;
	}

	public void signupfuction() {
		CommanMethod c_method= new  CommanMethod();
			
		
	 WebElement username=driver.findElement(locatorofusername);
	  username.sendKeys("Mona123@gmail.com");
	  
	  WebElement password=driver.findElement(locatorofpassword);
	  password.sendKeys("mona123");
	  
	  WebElement loginbnt=driver.findElement(By.xpath("//input[@name='login']"));
	  loginbnt.click();
	  
	  c_method.waitmethod(2000);

}
}