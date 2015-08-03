package com.selenium.ex;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateExample {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Options options = driver.manage();
		options.timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		options.window().maximize();
		driver.navigate().to("http://elearntutorial.blogspot.in/");
        
		WebElement element1 = driver.findElement(By.linkText("ManualTesting"));
		element1.click();
		WebElement element2 = driver.findElement(By.linkText("Selenium"));
		element2.click();

		driver.navigate().back();// moving to manual testing page
		Assert.assertTrue("Manual Testing page shoud be present", driver
				.findElement(By.linkText("ManualTesting")).isDisplayed());

		driver.navigate().forward();// moving to selenium page
		Assert.assertTrue("Manual Testing page shoud be present", driver
				.findElement(By.linkText("Selenium")).isDisplayed());
		
		driver.navigate().refresh();
				
		driver.close();
		/**
		 * Navigation
		 * to(String url)
		 * back()
		 * forward()
		 * refresh()
		 */

	}
}
