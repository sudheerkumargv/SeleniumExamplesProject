package com.selenium.batch11.ex;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MGC21AUG01 {
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
  public void testMGC21AUG01() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.name("param[homevalue]")).clear();
    driver.findElement(By.name("param[homevalue]")).sendKeys("10000");
    driver.findElement(By.id("loanamt")).clear();
    driver.findElement(By.id("loanamt")).sendKeys("5000");
    driver.findElement(By.id("intrstsrate")).clear();
    driver.findElement(By.id("intrstsrate")).sendKeys("5");
    driver.findElement(By.id("loanterm")).clear();
    driver.findElement(By.id("loanterm")).sendKeys("15");
    new Select(driver.findElement(By.name("param[start_month]"))).selectByVisibleText("Sep");
    new Select(driver.findElement(By.name("param[start_year]"))).selectByVisibleText("2016");
    driver.findElement(By.id("pptytax")).clear();
    driver.findElement(By.id("pptytax")).sendKeys("1.5");
    driver.findElement(By.id("pmi")).clear();
    driver.findElement(By.id("pmi")).sendKeys("0.75");
    driver.findElement(By.name("cal")).click();
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
