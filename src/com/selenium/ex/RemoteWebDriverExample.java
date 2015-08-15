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
					"http://192.168.0.100:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		remoteDriver.get("http://www.mortgagecalculator.org/");
		Thread.sleep(5*1000);
		WebElement homeValueElement = remoteDriver.findElement(By.name("param[homevalue]"));
		homeValueElement.clear();
		homeValueElement.sendKeys("10000");
		remoteDriver.close();
		
	}
	
	/*
	 * In case of running on chrome
	 * Set the capability as, capabilities.setBrowserName("chrome");
	 * run the following command to start seleinium server on remote
	 * >java -jar sel-standalone.jar -Dwebdriver.chrome.driver="c/chromedriver.exe"
	 * 
	 */
}
