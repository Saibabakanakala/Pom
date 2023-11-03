package com.Testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Basepage.Basepage;
import com.javapages.Frontoffice;
import com.javapages.Loginpage;

public class FrontofficeTest extends Basepage{
	
	@Test
	public void frontoffice() throws InterruptedException {
		Loginpage lg=new Loginpage(driver);
		lg.logincredentials();
		
		Frontoffice fc=new Frontoffice(driver);
		fc.logincredentials();
		
	}
	@BeforeTest
	public void browser() {
		browser("chrome","https://kareclouds.com/site/login");

}
}
