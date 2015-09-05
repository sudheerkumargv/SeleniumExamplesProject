package com.selenium.ex.mouseNkeywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex03_KeysUpNDown 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get(System.getProperty("user.dir")+"\\html\\Select.html");
	    Thread.sleep(5*1000);
	    
	    //usingDragAndDropAP+I(driver);
	    WebElement element1 = driver.findElement(By.xpath("//select/option[text()='Volvo']"));
	    WebElement element2 = driver.findElement(By.xpath("//select/option[text()='BMW']"));
	    Actions action = new Actions(driver);
	    action.keyDown(Keys.CONTROL);
	    action.click(element1);
	    action.click(element2);
	    action.keyUp(Keys.CONTROL);
	    action.build().perform();
	}

	
	
}
