package com.selenium.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utils {
  public static  void login(WebDriver driver) {
	  	driver.findElement(By.id("Email")).clear();
	    driver.findElement(By.id("Email")).sendKeys("Enter your username");
	    driver.findElement(By.id("next")).click();
	    driver.findElement(By.id("Passwd")).clear();
	    driver.findElement(By.id("Passwd")).sendKeys("Enter your password");
	    driver.findElement(By.id("signIn")).click();
	
}
  
  public static  void loginfb(WebDriver driver) {
	  	driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("Enter your username");
	    driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys("Enter your password");
	    driver.findElement(By.id("loginbutton")).click();
	
}
}
