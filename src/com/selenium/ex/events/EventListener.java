package com.selenium.ex.events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventListener implements WebDriverEventListener{

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		System.out.println("afterChangeValueOf:"+arg0.toString());
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("afterClickOn:"+arg0.toString());
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("afterFindBy:"+arg0.toString());
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		System.out.println("afterNavigateBack:"+arg0.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("afterNavigateForward:"+arg0.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("afterNavigateTo:"+arg0);
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		System.out.println("afterScript:"+arg0);
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		System.out.println("beforeChangeValueOf:"+arg0.toString());
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("beforeClickOn:"+arg0.toString());
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("beforeFindBy:"+arg0.toString());
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println("beforeNavigateBack:"+arg0.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		System.out.println("beforeNavigateForward:"+arg0.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("beforeNavigateTo:"+arg0);
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		System.out.println("beforeScript:"+arg0);
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("onException:"+arg0.toString());
		
	}

}
