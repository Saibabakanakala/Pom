package com.javapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Complain {
	
	    @FindBy(xpath="//i[@class='fas fa-dungeon']")
	    WebElement Frontoffice;
	
	    @FindBy(xpath="(//i[@class='fa fa-reorder'])[4]")
	    WebElement complain;
	   
	    @FindBy(xpath="//a[@class='btn btn-primary btn-sm complain']")
	    WebElement Addcomplain;
	    
	    @FindBy(xpath="(//select[@name='complaint'])[1]")
	    WebElement complainType;
    
	    @FindBy(xpath="(//option[@value='Hospital services'])[1]")
	    WebElement selectoption1;
	    
	    @FindBy(xpath="(//select[@name='source'])[1]")
	    WebElement source;
	    
	    @FindBy(xpath="(//option[@value='From visitors'])[1]")
	    WebElement selectoption2;
	    
	    @FindBy(name="name")
	    WebElement name;
	    
	    @FindBy(xpath="(//input[@type='text'])[4]")
	    WebElement phone;
	    
	    @FindBy(id="date")
	    WebElement date;
	    
	    @FindBy(id="description")
	    WebElement description;
	    
	    @FindBy(id="description")
	    WebElement Note;
	    
	    @FindBy(id="formaddbtn")
	    WebElement save;

	    
	    
	    public Complain(WebDriver driver) {
	    	PageFactory.initElements(driver, this);
	    }
	    	public void logincredentials() throws InterruptedException {
	    		
	    		Frontoffice.click();
	    		complain.click();
	    		Addcomplain.click();
	    		Thread.sleep(5000);
	    		complainType.click();
	    		selectoption1.click();
	    		Thread.sleep(5000);
	    		source.click();
	    		selectoption2.click();
	    		name.sendKeys("saikanakala");
	    		phone.sendKeys("123456789");
	    		date.sendKeys("28-09-2023");
	    		description.sendKeys("I am manual and AutomationTesting");
	    		Note.sendKeys("manual and Automation");
	    		save.click();
	    	}
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    


