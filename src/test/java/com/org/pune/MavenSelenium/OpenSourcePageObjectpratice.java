package com.org.pune.MavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class OpenSourcePageObjectpratice {
	WebDriver driver;

	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void login() {

		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin");
		
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		loginbtn.click();
 

	}

	@Test
	public void teardown() {
		
		driver.quit();

	}
}