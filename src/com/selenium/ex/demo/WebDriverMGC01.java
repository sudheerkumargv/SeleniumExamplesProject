package com.selenium.ex.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverMGC01
{
	public static void main(String[] args) {
		//WebDriver driver = new FirefoxDriver(); //to open browser and create driver instance
		
		System.setProperty("webdriver.chrome.driver", "G:/Selenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.mortgagecalculator.org/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		WebElement homeElement = driver.findElement(By.xpath("//div[@class='rw-box'][1]/input"));
//		homeElement.clear();
//		homeElement.sendKeys("10000");
//		
//		WebElement loanElement = driver.findElement(By.xpath("//div[@class='rw-box'][2]/input"));
//		loanElement.clear();
//		loanElement.sendKeys("4000");
//		
//		WebElement intrestElement = driver.findElement(By.id("intrstsrate"));
//		intrestElement.clear();
//		intrestElement.sendKeys("10");
//		
//		WebElement loanTermElement = driver.findElement(By.id("loanterm"));
//		loanTermElement.clear();
//		loanTermElement.sendKeys("15");
//		
//		WebElement monthElement = driver.findElement(By.name("param[start_month]"));
//		Select monthSelect = new Select(monthElement);
//		monthSelect.selectByVisibleText("Mar");
//		
//		WebElement yearElement = driver.findElement(By.name("param[start_year]"));
//		Select yearSelect = new Select(yearElement);
//		yearSelect.selectByVisibleText("2016");
//		
//		
//		WebElement propertyElement = driver.findElement(By.id("pptytax"));
//		propertyElement.clear();
//		propertyElement.sendKeys("1.8");
//		
//		WebElement ppiElement = driver.findElement(By.id("pmi"));
//		ppiElement.clear();
//		ppiElement.sendKeys("0.25");
//		
//		WebElement btnElement = driver.findElement(By.name("cal"));
//		btnElement.click();
		
		driver.findElement(By.linkText("Output parameters »")).click();
		
		
		
		//driver.close();
		
		
	}
}
