package com.selenium.ex.mouseNkeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ex04_DrawImage {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.theautomatedtester.co.uk/demo1.html");

		Actions builder = new Actions(driver);
		WebElement canvas = driver.findElement(By.id("tutorial"));
		Action dragAndDrop = builder.clickAndHold(canvas)
		  .moveByOffset(-40, -60)
		  .moveByOffset(20, 20)
		  .moveByOffset(100, 150)
		  .release(canvas)
		  .build();

		dragAndDrop.perform();
	}
}
