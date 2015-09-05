package com.selenium.ex.profile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ReadExistingBrowserProfile {
	public static void main(String[] args) {
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("qa");
		WebDriver driver = new FirefoxDriver(myprofile);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("100");
	}
}
