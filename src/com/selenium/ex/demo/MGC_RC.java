package com.selenium.ex.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.SeleneseTestCase;


public class MGC_RC extends SeleneseTestCase {
	WebDriver driver = new FirefoxDriver();

@BeforeMethod
public void setUp() throws Exception {
    setUp("http://www.mortgagecalculator.org/","*firefox");
}

	@Test public void testMGC_RC() throws Exception {

		selenium.open("http://www.mortgagecalculator.org/","*firefox");
		selenium.click("name=param[homevalue]");
		
		selenium.type("name=param[homevalue]","");
		selenium.type("name=param[homevalue]", "1000");
		selenium.type("id=loanamt", "200");
		selenium.type("id=intrstsrate", "3");
		selenium.type("id=loanterm", "5");
		selenium.select("name=param[start_month]", "label=Aug");
		selenium.select("name=param[start_year]", "label=2007");
		selenium.type("id=pptytax", "1.5");
		selenium.type("id=pmi", "0.25");
		if(selenium.isElementPresent("name=cal"))
		{
			selenium.click("name=cal");
		}
		
		selenium.waitForPageToLoad("30000");
	}
}