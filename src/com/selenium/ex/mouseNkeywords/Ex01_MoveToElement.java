package com.selenium.ex.mouseNkeywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex01_MoveToElement 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(5*1000);
		
		//ContextClick
		WebElement element = driver.findElement(By.cssSelector(".context-menu-one.box"));
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.contextClick();
		action.click(driver.findElement(By.xpath("//ul/li//span[text()='Cut']")));
		action.build().perform();
		Thread.sleep(5*1000);
		driver.quit();
		
	}
}
