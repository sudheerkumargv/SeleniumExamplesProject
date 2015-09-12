package com.selenium.ex.profile;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FireFoxProfileWithPlugingsInstalled 
{
	public static void main(String[] args) throws IOException 
	{
		FirefoxProfile profile = new FirefoxProfile();
		File file = new File("G:\\firebug-2.0.12-fx.xpi");
		profile.addExtension(file);
		WebDriver driver = new FirefoxDriver(profile);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Sudheer Tech");
	}
}
