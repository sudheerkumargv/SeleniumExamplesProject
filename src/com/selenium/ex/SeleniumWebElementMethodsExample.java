package com.selenium.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebElementMethodsExample
{
	public static void main(String[] args)
	{
		 WebDriver driver = new FirefoxDriver();  //its to initialize firefox dirve, and open the browser
		 driver.get("http://www.google.com");
		 WebElement searchButton = driver.findElement(By.name("btnK"));
		 String btnLabel = searchButton.getAttribute("aria-label");
		 String btnTagName = searchButton.getTagName(); 
		 boolean isSearchBtnDisplayed =  searchButton.isDisplayed();
		 boolean isSearchBtnEnabled = searchButton.isEnabled();
		 boolean isSelected = searchButton.isSelected();
		 String cssValue = searchButton.getCssValue("font-family");
		 Point searchBtnLoc = searchButton.getLocation();
		 Dimension searchBtnSize = searchButton.getSize();
		 
		 WebElement linkElement = driver.findElement(By.xpath("//div[@id='_eEe']/a[3]"));
		 String linkText = linkElement.getText();
		 //clear,sendKeys,submit
		 WebElement searchBox = driver.findElement(By.name("q"));
		 searchBox.sendKeys(Keys.chord(Keys.SHIFT,"packt publishing"));
		 searchBox.submit(); //submit can only be used to click the button which is part of a form
		 
		 System.out.println("Button Label:"+btnLabel);
		 System.out.println("Link Text:"+linkText);
		 System.out.println("Button Tag Name:"+btnTagName);
		 System.out.println("Is Search Button Displayed:"+isSearchBtnDisplayed);
		 System.out.println("Is Search Button Enabled:"+isSearchBtnEnabled);
		 System.out.println("Is Selected:"+isSelected);
		 System.out.println("Css Value:"+cssValue);
		 System.out.println("Search Btn Loc:"+searchBtnLoc.getX()+","+searchBtnLoc.getY());
		 System.out.println("Search Btn Size:"+searchBtnSize.getWidth()+","+searchBtnSize.getHeight());
		 
		}
	}
