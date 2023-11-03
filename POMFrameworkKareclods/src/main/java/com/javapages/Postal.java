package com.javapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Postal {
	
	@FindBy(xpath="//i[@class='fas fa-dungeon']")
	WebElement Frontoffice;
	
	@FindBy(xpath="//button[@id='dropdownMenu1']")
	WebElement postal;
	
	@FindBy(xpath="(//li[@class='es-selectable'])[1]")
	WebElement Receive;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-sm receive']")
	WebElement AddReceive;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement Fromtitle;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement ReferenceNo;
	
	@FindBy(xpath="(//textarea[@id='description'])[1]")
	WebElement Address;
	
	@FindBy(xpath="(//textarea[@id='description'])[2]")
	WebElement Note;
	
	@FindBy(xpath="(//input[@name='to_title'])[1]")
	WebElement ToTitle;
	
	@FindBy(xpath="//input[@id='date']")
	WebElement Date;
	
	@FindBy(xpath="//button[@id='formaddbtn']")
	WebElement save;

	public Postal(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logincredentials() throws InterruptedException {
		Frontoffice.click();
		postal.click();
		Receive.click();
		AddReceive.click();
		Thread.sleep(3000);
		Fromtitle.sendKeys("testing team");
		ReferenceNo.sendKeys("1234556789");
		Address.sendKeys("hitech-city");
		ToTitle.sendKeys("Testing Engineer");
		Thread.sleep(7000);
		Date.sendKeys("05-10-2023");
		Thread.sleep(3000);
		save.click();
		
		
		
		
		
	}
}
