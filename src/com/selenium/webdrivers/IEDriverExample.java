package com.selenium.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverExample {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.ie.driver","G:\\Selenium\\Driver\\IEDriverServer.exe");
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5*1000);
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("sudheer tech");
		driver.quit();
	}
}
