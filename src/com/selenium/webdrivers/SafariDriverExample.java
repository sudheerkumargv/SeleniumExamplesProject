package com.selenium.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SafariDriverExample {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.opera.driver","G:\\Selenium\\Driver\\IEDriverServer.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5*1000);
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("sudheer tech");
		driver.quit();
	}
}
