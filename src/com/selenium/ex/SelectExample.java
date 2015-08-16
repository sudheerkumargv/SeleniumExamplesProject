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
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.mortgagecalculator.org/"); //Open URL in FireFox
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.name("param[start_month]"));
		Select select = new Select(element);
		select.selectByIndex(1);
		select.selectByValue("4");
		select.selectByVisibleText("Jun"); //select the text if its visible
		WebElement firstValue = select.getFirstSelectedOption(); //gives the current selected option
		System.out.println(firstValue.getText());
		List<WebElement> options = select.getOptions();//returns all the options from the list
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();//returns all the options from the list
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		select.deselectByIndex(1);
		select.deselectByValue("Apr");
		select.deselectByVisibleText("Jun");
		
		
		
	}
}
