package com.selenium.ex.waits;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitEx {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		long start =System.currentTimeMillis();
		try{
			driver.findElement(By.name("btnK"));
		}catch(Exception e){}
		long end =System.currentTimeMillis();
		System.out.println((end-start)/1000);
		
		start =System.currentTimeMillis();
		try{
			driver.findElement(By.name("btnI"));
		}catch(Exception e){e.printStackTrace();}
		end =System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}
}
