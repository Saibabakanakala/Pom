package com.javapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Frontoffice {

	@FindBy(xpath="//i[@class='fas fa-dungeon']")
	WebElement Frontoffice;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-sm addappointment']")
	WebElement Addappintment;

	@FindBy(id="date")
     WebElement Date;
	
	
	@FindBy(xpath="//input[@id='patient_name']")
	WebElement patientname;
	
	@FindBy(xpath="(//select[@class='form-control'])[1]")
	WebElement gender;
	
	@FindBy(xpath="(//option[@value='Male'])[1]")
	WebElement gendermale;

	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="phone")
	WebElement phone;
	
    @FindBy(xpath="//span[@id='select2-doctorid-container']")
    WebElement Doctor;
    
    @FindBy(xpath="//option[@value='5'][1]")
    WebElement salma;    
    
    @FindBy(xpath="(//span[@class='select2-selection__rendered'])[3]")
    WebElement Apointmentpriority;
    
    @FindBy(xpath="(//option[@value='5'])[2]")
    WebElement sdf;
    
    @FindBy(id="note")
    WebElement Note;
    
    @FindBy(xpath="(//select[@name='appointment_status'])[1]")
    WebElement Status;
    
    @FindBy(xpath="(//option[@value='approved'])[1]")
    WebElement value;
    
    @FindBy(xpath="(//select[@class='form-control'])[3]")
    WebElement Liveconsultant;
    
    @FindBy(xpath="(//option[@value='Yes'])[1]")
    WebElement Yes;
    
    @FindBy(xpath="//button[@id='formaddbtn']")
    WebElement save;
    
    
	public Frontoffice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logincredentials() throws InterruptedException {
		Frontoffice.click();
		Addappintment.click();
		Thread.sleep(3000);
		Date.sendKeys("01-09-2023 1:10 PM");
		patientname.sendKeys("sai");
		gender.click();
		Thread.sleep(3000);
		gendermale.click();
		email.sendKeys("sai@gmail.com");
		phone.sendKeys("123456789");
		Thread.sleep(2000);
        salma.click();
        Thread.sleep(3000);
        sdf.click();
        Note.sendKeys("Automation Engineer");
		value.click();
		Yes.click();
		save.click();
		
		
		
	}
	

}
