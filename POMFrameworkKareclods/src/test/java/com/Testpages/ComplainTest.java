package com.Testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Basepage.Basepage;
import com.javapages.Complain;
import com.javapages.Loginpage;

public class ComplainTest extends Basepage {
	
	@Test
	public void complaintest() throws InterruptedException {
		Loginpage lg=new Loginpage(driver);
		lg.logincredentials();
		
		Complain cs=new Complain(driver);
		cs.logincredentials();
	
	}
	@BeforeTest
	public void browser() {
		 browser("chrome","https://kareclouds.com/site/login");
	}

}
