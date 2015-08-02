package com.selenium.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriverExample
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.mortgagecalculator.org/");
		WebElement homeAmtElement = driver.findElement(By.name("param[homevalue]"));
		homeAmtElement.clear();
		homeAmtElement.sendKeys("10000");
		WebElement loanAmtElement = driver.findElement(By.id("loanamt"));
		loanAmtElement.clear();
		loanAmtElement.sendKeys("5000");
		WebElement calBtnElement = driver.findElement(By.name("cal"));
		calBtnElement.click();
		driver.close();
		driver.quit();
	}
}
