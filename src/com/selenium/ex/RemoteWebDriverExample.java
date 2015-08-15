package com.selenium.ex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoteWebDriverExample {
	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		RemoteWebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL(
					"http://192.168.0.100:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.get("http://www.mortgagecalculator.org/"); //Open URL in FireFox
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(5*1000);
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
		driver.quit();
		
	}
	
	/*
	 * In case of running on chrome
	 * Set the capability as, capabilities.setBrowserName("chrome");
	 * run the following command to start seleinium server on remote
	 * >java -jar sel-standalone.jar -Dwebdriver.chrome.driver="c/chromedriver.exe"
	 * 
	 */
}
