package com.javapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontofficeVisitor {
	
	@FindBy(xpath="//i[@class='fas fa-dungeon']")
	WebElement Frontoffice;
	
	@FindBy(xpath="(//i[@class='fa fa-reorder'])[1]")
	WebElement visitorBook;

	@FindBy(xpath="//a[@class='btn btn-primary btn-sm addvisitor']")
	WebElement Addvisitor;
	
	@FindBy(xpath="(//select[@name='purpose'])[2]")
	WebElement purpose;
	
	@FindBy(xpath="(//option[@value='@visit aditya'])[2]")
	WebElement purpoose;
	
	@FindBy(xpath="(//input[@name='name'])[2]")
	WebElement Name;
    
    @FindBy(xpath="(//input[@class='form-control'])[7]")
    WebElement contact;
   
    @FindBy(xpath="(//input[@name='id_proof'])[2]")
    WebElement id;
    
    @FindBy(xpath="(//input[@name='pepples'])[2]")
    WebElement Numerofperson;
    
    @FindBy(id="date")
    WebElement Date;
    
//    @FindBy(xpath="(//td[@class='day'])[5]")
//    WebElement date;
    
    @FindBy(id="description")
    WebElement Note;
    
public FrontofficeVisitor(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	public void logincredentials() throws InterruptedException {
		Frontoffice.click();
		visitorBook.click();
		Addvisitor.click();
		Thread.sleep(3000);
		purpoose.click();
		Thread.sleep(2000);
		Name.sendKeys("manual testing");
		Thread.sleep(3000);
		contact.sendKeys("12344556");
		id.sendKeys("SDST001)");
		Numerofperson.sendKeys("456677");
		Thread.sleep(7000);
		Date.sendKeys("18-09-2023");
		Thread.sleep(3000);
		Note.sendKeys("hello world");
		
	}
}
