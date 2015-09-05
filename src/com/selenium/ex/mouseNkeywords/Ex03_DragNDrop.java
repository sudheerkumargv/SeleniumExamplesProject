package com.selenium.ex.mouseNkeywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex03_DragNDrop 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("http://jqueryui.com/demos/droppable/");
	    driver.switchTo().frame(0);
	    Thread.sleep(5*1000);
	    
	    //usingDragAndDropAPI(driver);
	    usingClickNHold(driver);
	}

	private static void usingDragAndDropAPI(WebDriver driver) {
		WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(draggable, droppable).perform();
	}
	
	private static void usingClickNHold(WebDriver driver) {
		WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.clickAndHold(draggable);
        action.moveToElement(droppable);
        action.release();
        action.build().perform();
	}
	
}
