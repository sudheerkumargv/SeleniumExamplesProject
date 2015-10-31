package com.selenium.ex.demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseMorgageCalculator01 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.mortgagecalculator.org/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCaseMorgageCalculator01() throws Exception {
    driver.get(baseUrl + "/"); //is used for opening the browser with the url
    WebElement element = driver.findElement(By.name("param[homevalue]"));
    element.clear();
    element.sendKeys("20000");
    driver.findElement(By.id("loanamt")).clear();
    driver.findElement(By.id("loanamt")).sendKeys("10000");
    driver.findElement(By.id("intrstsrate")).clear();
    driver.findElement(By.id("intrstsrate")).sendKeys("5");
    driver.findElement(By.id("loanterm")).clear();
    driver.findElement(By.id("loanterm")).sendKeys("20");
    WebElement element1 = driver.findElement(By.name("param[start_month]"));
	new Select(element1).selectByVisibleText("Jul");
    WebElement element2 = driver.findElement(By.name("param[start_year]"));
	new Select(element2).selectByVisibleText("2016");
    driver.findElement(By.id("pptytax")).clear();
    driver.findElement(By.id("pptytax")).sendKeys("1.5");
    driver.findElement(By.id("pmi")).clear();
    driver.findElement(By.id("pmi")).sendKeys("0.25");
    driver.findElement(By.name("cal")).click();
    assertEquals("$91.00", driver.findElement(By.cssSelector("h3")).getText());
    driver.findElement(By.xpath("html/body/header/div/div/a/img")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
