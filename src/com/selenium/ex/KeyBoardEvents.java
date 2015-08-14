package com.selenium.ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Options options = driver.manage();
		options.timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		options.window().maximize();
		driver.get("https://drive.google.com/drive/my-drive");
		Utils.login(driver);
		Thread.sleep(30*1000);
//		handlingKeyboardEvents(driver);
		handlingContextClick(driver);
//		dragNDrop(driver);

	}

	private static void handlingContextClick(WebDriver driver) {
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div/span[contains(text(),'Student Details')]"));
		actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();

	}

	private static void handlingKeyboardEvents(WebDriver driver)
	{
		// First Method
		WebElement element = driver.findElement(By
				.xpath("//div[contains(text(),'My Drive')]"));
		Actions actions = new Actions(driver);
		actions.click(element);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_RIGHT);
		actions.sendKeys(Keys.ARROW_UP);
		actions.sendKeys(Keys.ENTER);
		actions.perform();
		// Seond Method
		// actions.click(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).perform();
	}
	
	
	public static void dragNDrop(WebDriver driver)
	{
	    driver.get("http://jqueryui.com/demos/droppable/");
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        new Actions(driver).dragAndDrop(draggable, droppable).perform();
	}

}
