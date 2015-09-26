package com.selenium.ex.cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesExample1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		//Get All Cookies
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.toString());
		}
		
		//GetNamedCookies
		Cookie cookieNID = driver.manage().getCookieNamed("NID");
		System.out.println(cookieNID.toString());
		
		//Add a Cookie
		Cookie cookieNID1= new Cookie("NID1","72=w0IXrx18ZiAMw_uEIq8mHyOCQgrssPqQyBQLYCCRtMQRNA3fFARSAU8STjqutcpZYGgVGRhssuvS4-9clESe2uiWo9VIiwQY3JDdUVIzlV4LOLa0JWQ0YEfqjzP9oYxmXxUvuA; expires=Sat, 26 Mar 2016 07:47:39 IST; path=/; domain=.google.co.in");
		driver.manage().addCookie(cookieNID1);

		
		driver.manage().deleteCookie(cookieNID1);
		Cookie cNID1 = driver.manage().getCookieNamed("NID1");
		System.out.println(cNID1.toString());
		
		driver.manage().deleteAllCookies();
		Cookie cookie1 = driver.manage().getCookieNamed("NID");
		System.out.println(cookie1.toString());
	}
}
