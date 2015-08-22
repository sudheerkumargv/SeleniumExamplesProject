package com.selenium.ex;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample 
{
	public static void main(String[] args)throws Exception
	{
		WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(System.getProperty("user.dir")+"\\html\\Select.html"); //Open URL in FireFox
	    Thread.sleep(2*1000);
		WebElement element = driver.findElement(By.name("cars")); //find the select element
		Select select = new Select(element);
		select.selectByIndex(0); //select by index
		Thread.sleep(2*1000);
		select.selectByValue("opelcar"); //select by value
		Thread.sleep(2*1000);
		select.selectByVisibleText("BMW"); //select by text
		
		//Get First Selected or Currently Selected option
		WebElement firstValue = select.getFirstSelectedOption(); //gives the current selected option
		System.out.println("First Selected Option:"+firstValue.getText());
		
		//Get all the selected options 
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
			System.out.println("Selected Option:"+webElement.getText());
		}

		//Get all the options present in the Select element
		List<WebElement> options = select.getOptions();//returns all the options from the list
		for (WebElement webElement : options)
		{
			System.out.println("options:"+webElement.getText());
		}
		
		select.deselectByIndex(0);
		Thread.sleep(2*1000);
		select.deselectByValue("bmwcar");
		Thread.sleep(2*1000);
		select.deselectByVisibleText("Opel");
	}
}
