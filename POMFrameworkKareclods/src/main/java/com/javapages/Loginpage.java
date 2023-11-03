package com.javapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement signin;

	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

 public void logincredentials() {
	   username.sendKeys("superadmin@gmail.com");
	   password.sendKeys("Admin@123");
	   signin.click();
 }
	 
 }
