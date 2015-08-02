package com.selenium.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesExample3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		try{
	           File f = new File("app.data");
	           FileReader fr = new FileReader(f);
	           BufferedReader br = new BufferedReader(fr);
	           String line;
	           while((line=br.readLine())!=null){
	               StringTokenizer str = new StringTokenizer(line,";");
	               while(str.hasMoreTokens()){
	                   String name = str.nextToken();
	                   String value = str.nextToken();
	                   String domain = str.nextToken();
	                   String path = str.nextToken();
	                   Date expiry = null;
	                   String dt;
	                   if(!(dt=str.nextToken()).equals("null")){
	                	   
	                       String expectedPattern = "EEE MMM d HH:mm:ss z yyyy";
	                       SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
	                       try
	                       {
	                         // (2) give the formatter a String that matches the SimpleDateFormat pattern
	                         expiry = formatter.parse(dt);
	                    
	                         // (3) prints out "Tue Sep 22 00:00:00 EDT 2009"
	                         System.out.println(expiry);
	                       }
	                       catch (ParseException e)
	                       {
	                         // execution will come here if the String that is given
	                         // does not match the expected format.
	                         e.printStackTrace();
	                       }
	                   }
	                   boolean isSecure = new Boolean(str.nextToken()).booleanValue();
	                   Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);
	                   driver.manage().addCookie(ck);
	               }
	           }
	      }catch(Exception ex){
	           ex.printStackTrace();
	      }
	      driver.get("https://www.facebook.com/");
	      Thread.sleep(5*1000);
	      driver.close();
	}

}
