package com.Testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Basepage.Basepage;
import com.javapages.Loginpage;

public class LoginpageTest extends Basepage{
	
	@Test
	public void loginpage() {
		Loginpage lg=new Loginpage(driver);
		lg.logincredentials();
			
		}
	@BeforeTest
	public void browser() {
		browser("chrome","https://kareclouds.com/site/login");
	}

}
