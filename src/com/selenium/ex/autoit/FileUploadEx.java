package com.selenium.ex.autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadEx {

	static WebDriver driver;
	String URL = System.getProperty("user.dir")+"\\html\\Practice.html";
	@Test
	public void testUpload() throws InterruptedException, IOException
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(URL);
		WebElement element = driver.findElement(By.id("fakeBrowse"));
		element.click();
               //Which calls the autoit exe file
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\autoit\\fileupload.exe");
	}
	
}
