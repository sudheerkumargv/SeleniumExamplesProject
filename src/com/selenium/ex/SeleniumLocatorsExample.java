package com.selenium.ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocatorsExample 
{
  public static void main(String[] args)
  {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.mortgagecalculator.org/");
	WebElement homeElement = driver.findElement(By.name("param[homevalue]"));
	homeElement.clear();
	homeElement.sendKeys("10000");
	
	WebElement loanAmtElement = driver.findElement(By.id("loanamt"));
	loanAmtElement.clear();
	loanAmtElement.sendKeys("5000");
	
	driver.findElement(By.xpath("html/body/section/div/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[3]/input")).sendKeys("5");
	driver.findElement(By.cssSelector("#loanterm")).sendKeys("10");
	driver.findElement(By.linkText("Output parameters »")).click();
	driver.findElement(By.partialLinkText("Output parameters")).click();
	List<WebElement> inputElements = driver.findElements(By.tagName("input"));
	System.out.println(inputElements.size());
  }
}
