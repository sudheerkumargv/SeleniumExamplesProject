package com.selenium.ex.waits;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

		long start = System.currentTimeMillis();
		try {
			WebDriverWait driverWait = new WebDriverWait(driver, 30);
			driverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("btnK123")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000);

		start = System.currentTimeMillis();
		try {
			driver.findElement(By.name("btnI123"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) / 1000);
	}
}
