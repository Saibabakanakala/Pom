package com.javapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontofficePhonecallLog {
	
	@FindBy(xpath="//i[@class='fas fa-dungeon']")
	WebElement Frontoffice;
	
	@FindBy(xpath="(//i[@class='fa fa-reorder'])[2]")
	WebElement phonecallog;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-sm call_log']")
	WebElement AddcallLog;
	
	@FindBy(xpath="(//input[@class='form-control'])[6]")
	WebElement Name;
	
	@FindBy(xpath="(//input[@class='form-control'])[7]")
	WebElement Phone;
	
	@FindBy(xpath="(//input[@name='call_type'])[3]")
	WebElement incoming;


 public FrontofficePhonecallLog(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
	public void logincredentials () throws InterruptedException{
		Frontoffice.click();
		phonecallog.click();
		AddcallLog.click();
		Thread.sleep(4000);
		Name.sendKeys("manual Testing");
		Thread.sleep(2000);
		Phone.sendKeys("123445676");
		incoming.click();
		
		 
	 }
	
	  
	
	
}

