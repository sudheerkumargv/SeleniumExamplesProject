package com.selenium.ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestOnSpecificVersions {

	
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.javascriptkit.com/javatutors/event2.shtml");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.name("fd0")).click();
		//((JavascriptExecutor)driver).executeScript("inform()");
		((JavascriptExecutor)driver).executeScript("document.getElementsByName('fd0')[0].click()");
	}
}
