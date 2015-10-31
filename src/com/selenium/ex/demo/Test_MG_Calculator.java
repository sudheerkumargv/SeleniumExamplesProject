package com.selenium.ex.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_MG_Calculator 
{
	public static void main(String[] args)
	{
		//WebDriver driver  = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.mortgagecalculator.org/"); //Open URL in FireFox
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter HomeValue
		WebElement homeValueElement = driver.findElement(By.name("param[homevalue]"));  //element finding
		homeValueElement.clear();
		homeValueElement.sendKeys("10000");
		//Enter LoanAmout
		WebElement loanAmtElement = driver.findElement(By.id("loanamt"));
		loanAmtElement.clear();
		loanAmtElement.sendKeys("5000");
		//Enter IntrestRate
		WebElement intrElement = driver.findElement(By.id("intrstsrate"));
		intrElement.clear();
		intrElement.sendKeys("5");
		//Enter LoanTerm
		WebElement loanTermElement = driver.findElement(By.id("loanterm"));
		loanTermElement.clear();
		loanTermElement.sendKeys("10");
		//Enter PropertyTax
		WebElement propertyElement = driver.findElement(By.id("pptytax"));
		propertyElement.clear();
		propertyElement.sendKeys("1");
		//Enter PMI
		WebElement pmiElement = driver.findElement(By.id("pmi"));
		pmiElement.clear();
		pmiElement.sendKeys("0.25");
		//SelectStartDate Month
		WebElement monthElement = driver.findElement(By.name("param[start_month]"));
		Select month = new Select(monthElement);
		month.selectByVisibleText("Mar");
		//SelectStartDate Year
		WebElement yearElement = driver.findElement(By.name("param[start_year]"));
		Select year = new Select(yearElement);
		year.selectByVisibleText("2016");
		//Click on Caluclate Button
		WebElement calBtn = driver.findElement(By.name("cal"));
		calBtn.click();
		driver.close();
		driver.quit();
	}
}
