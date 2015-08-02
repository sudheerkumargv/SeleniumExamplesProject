package com.selenium.ex;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebDriverExample {
	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		RemoteWebDriver remoteDriver = null;
		try {
			remoteDriver = new RemoteWebDriver(new URL(
					"http://127.0.0.1:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		remoteDriver.get("http://www.mortgagecalculator.org/");
		WebElement homeValueElement = remoteDriver.findElement(By.name("param[homevalue]"));
		homeValueElement.clear();
		homeValueElement.sendKeys("10000");
		Thread.sleep(5*1000);
		remoteDriver.close();
	}
}
