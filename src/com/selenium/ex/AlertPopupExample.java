package com.selenium.ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupExample
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(System.getProperty("user.dir")+"\\html\\APM.html");
		
		WebElement confirmBtn = driver.findElement(By.id("btnConfirm"));
		confirmBtn.click();
		driver.switchTo().alert().dismiss();
		
		
		WebElement alertBtn = driver.findElement(By.id("btnAlert"));
		alertBtn.click();
		driver.switchTo().alert().accept();
		
		WebElement promptBtn = driver.findElement(By.id("btnPrompt"));
		promptBtn.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hi Prompt");
		alert.accept();
		
		/*
		 * Alert 
		   --------
			void accept()
			void dismiss()
			java.lang.String getText()
			void sendKeys(java.lang.String keysToSend)
		 */
	}
}
