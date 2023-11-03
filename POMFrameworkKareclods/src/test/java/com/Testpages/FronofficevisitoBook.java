package com.Testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Basepage.Basepage;
import com.javapages.FrontofficeVisitor;
import com.javapages.Loginpage;

public class FronofficevisitoBook extends Basepage{
	@Test
	public void frontofficevisitbook() throws InterruptedException {
		Loginpage lg=new Loginpage(driver);
		lg.logincredentials();
		
		FrontofficeVisitor fc=new FrontofficeVisitor(driver);
		fc.logincredentials();
		
	}
	@BeforeTest
	 public void browser() {
		 browser("chrome","https://kareclouds.com/site/login");
	 }
	
	
}
