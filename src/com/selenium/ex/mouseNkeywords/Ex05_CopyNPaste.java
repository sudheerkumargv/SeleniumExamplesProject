package com.selenium.ex.mouseNkeywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ex05_CopyNPaste {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
    driver.get("https://www.facebook.com");
    Thread.sleep(5*1000);
    
    WebElement emailElement = driver.findElement(By.id("email"));
    WebElement pwdElement = driver.findElement(By.id("pass"));
	emailElement.sendKeys("sudheer@gmail.com");
	
    Actions action = new Actions(driver);
    action.click(emailElement).build().perform();
    action.sendKeys(Keys.chord(Keys.CONTROL, "a"));
    action.sendKeys(Keys.chord(Keys.CONTROL, "c"));
    action.click(pwdElement);
    action.sendKeys(Keys.chord(Keys.CONTROL, "v"));
    action.build().perform();
    
    
    
}
}
