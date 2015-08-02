package com.selenium.ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesHandlingExample {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("G:\\Selenium\\SeleniumExamples\\Frames\\Frames.html");
		
		/*
		 * Frame can be identified by index,name,id,as WebElement
		 */
		
		// switch to frameA by index
		driver.switchTo().frame(0); 
		WebElement elementFname1 = driver.findElement(By.name("fname1"));
		elementFname1.sendKeys("Sudheer");
		
		//Swtich back to main window to find other frames
		driver.switchTo().defaultContent(); 
		// switch to frameB by using id
		driver.switchTo().frame("fb");
		WebElement elementFname2 = driver.findElement(By.name("fname2"));
		elementFname2.sendKeys("Kumar");
		
		// switch to frameC by passing webelement to the frame method
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@src='frame_c.html']")));
		WebElement elementFname3 = driver.findElement(By.name("fname3"));
		elementFname3.sendKeys("Sudheer Kumar");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement lastNameElement = driver.findElement(By.name("lname1"));
		lastNameElement.sendKeys("In LastName");
		
	}
}
