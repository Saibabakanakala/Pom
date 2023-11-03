package com.Testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Basepage.Basepage;
import com.javapages.FrontofficePhonecallLog;
import com.javapages.Loginpage;

public class FrontofficePhonecallLogTest extends Basepage{
	
	
	@Test
	public void frontofficePhonecallLog() throws InterruptedException {
	
		Loginpage lg=new Loginpage(driver);
		lg.logincredentials();
		
		FrontofficePhonecallLog fc=new FrontofficePhonecallLog(driver);
		fc.logincredentials();
	}
	@BeforeTest
    public void browser() {
		browser("chrome","https://kareclouds.com/site/login");
	
}
}
