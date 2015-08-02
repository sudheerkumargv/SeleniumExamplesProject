package com.selenium.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesExample2
{
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Utils.loginfb(driver);
    	 File f = new File("app.data");
		    try{
		         f.delete();
		         f.createNewFile();
		         FileWriter fos = new FileWriter(f);
		         BufferedWriter bos = new BufferedWriter(fos);

		         Set<Cookie> cookies = driver.manage().getCookies();
		         for(Cookie ck : cookies) {
		        	       bos.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()
		                      +";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
		        	    bos.newLine();
		         }
		         bos.flush();
		         bos.close();
		         fos.close();
		     }catch(Exception ex){
		         ex.printStackTrace();
		     }
		    driver.close();
	}
	
	/**
	 *  To avoid login to application every time, you can signing in for one time and 
	 *  writing all the cookies of that domain into a file.
	 *  From the next login onwards, you can actually load the cookies from the file and add to the driver.
	 *  driver.manage().getCookies() //give all the associated cookies for that web page stores in the current session
	 *  Each cookie is associated with a name, value, domain, path, expiry, and the status of whether it is secure or not.
	 *  The server to validate a client cookie parses all of these values. 
	 *  Now, we will store all of this information for each cookie in a file 
	 *  so that our individual test cases read from this file and load that information into the driver. 
	 *  Hence, you can skip the login, because once your driver session has this information in it, 
	 *  the Facebook server treats your browser session as authenticated and directly takes you to your requested URL.
	 */
}
