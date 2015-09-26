package com.selenium.ex.events;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EventExample {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		EventFiringWebDriver firingDriver = new EventFiringWebDriver(driver);
		EventListener listener = new EventListener();
		firingDriver.register(listener);
		firingDriver.get("http://www.google.com");
		WebElement element = firingDriver.findElement(By.name("q"));
		element.sendKeys("Sudheer Tech");
	}
}
