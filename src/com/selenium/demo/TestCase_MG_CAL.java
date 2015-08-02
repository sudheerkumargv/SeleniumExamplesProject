package com.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase_MG_CAL
{

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Options options = driver.manage();
		options.timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		options.window().maximize();
		driver.get("http://www.mortgagecalculator.org/");
		WebElement homeAmtElement = driver.findElement(By.name("param[homevalue]"));
		homeAmtElement.clear();
		homeAmtElement.sendKeys("10000");
		WebElement loanAmtElement = driver.findElement(By.id("loanamt"));
		loanAmtElement.clear();
		loanAmtElement.sendKeys("5000");
		WebElement calBtnElement = driver.findElement(By.name("cal"));
		calBtnElement.click();
		driver.quit();
		
	}
	
	
}
