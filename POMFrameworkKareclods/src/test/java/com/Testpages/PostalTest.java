package com.Testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Basepage.Basepage;
import com.javapages.Loginpage;
import com.javapages.Postal;

public class PostalTest extends Basepage {
	@Test
	public void postaltest () throws InterruptedException {
		Loginpage lg=new Loginpage(driver);
		lg.logincredentials();
		Postal pg=new Postal(driver);
		pg.logincredentials();
	}
		@BeforeTest
		public void browser() {
			browser("chrome","https://kareclouds.com/site/login");
		
	}

	
	
}
