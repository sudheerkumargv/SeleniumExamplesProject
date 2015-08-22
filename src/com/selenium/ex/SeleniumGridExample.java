package com.selenium.ex;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridExample
{
	public static void main(String[] args) throws InterruptedException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.WIN8_1);
		capabilities.setBrowserName("firefox");
		RemoteWebDriver remoteWD = null;
		Thread.sleep(10*1000);
		try {
			remoteWD = new RemoteWebDriver(new URL("http://192.168.0.100:2222//wd/hub"), capabilities);
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		remoteWD.get("http://www.google.com");
		WebElement element = remoteWD.findElement(By.name("q"));
		Thread.sleep(3*1000);
		element.sendKeys("Selenium APIs");
		remoteWD.quit();
	}

	/**
	 * Keep this jar "selenium-server-standalone-2.33.0.jar" hub aswellas all
	 * nodes, run depends on role you want 
	 * java -jar "selenium-server-standalone-2.46.0.jar" -help //gives info of options
	 * java -jar selenium-server-standalone-2.33.0.jar -role hub //starts hub in
	 * default port 4444 java -jar selenium-server-standalone-2.33.0.jar -role
	 * hub -port 1111 //starts hub in port 1111 
	 * java –jar selenium-server-standalone-2.33.0.jar –role node –hub http://172.16.87.131:1111/grid/register
	 * java -jar selenium-server-standalone-2.33.0.jar -role node -hub http://172.16.87.131:1111/grid/register -browser browserName=firefox
	 * -browser browserName=chrome -browser browserName=safari java -jar
	 * selenium-server-standalone-2.33.0.jar -role node -hub
	 * http://172.16.87.131:1111/grid/register -nodeTimeout 300 java -jar
	 * selenium-server-standalone-2.33.0.jar -role node -hub
	 * http://172.16.87.131:1111/grid/register -browser
	 * "browserName=firefox,maxInstances=3" -browser
	 * "browserName=chrome,maxInstances=3" -browser
	 * "browserName=safari,maxInstances=1" java -jar
	 * selenium-server-standalone-2.33.0.jar -role node -hub
	 * http://172.16.87.131:1111/grid/register -registerCycle 10000 // node to
	 * reregister itself automatically to the hub after a specified amount of
	 * time in ms. If not specified, the default time of reregistration is five
	 * seconds. java -jar selenium-server-standalone-2.33.0.jar -role node -hub
	 * http://172.16.87.131:1111/grid/register -nodePolling 5
	 * -unregistIfStillDownAfter 20000
	 * java ‐jar selenium‐server‐standalone‐2.33.0.jar ‐role hub ‐port 1111 
	 * ‐throwOnCapabilityNotPresent false
	 */
}
