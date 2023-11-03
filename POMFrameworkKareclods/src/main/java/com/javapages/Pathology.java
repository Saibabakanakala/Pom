package com.javapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pathology {
	
	
	@FindBy(xpath="//i[@class='fas fa-flask']")
	WebElement pathology;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-sm pathology']")
	WebElement AddpathologyTest;
	
	@FindBy(name="test_name")
	WebElement name;
	
	@FindBy(name="short_name")
	WebElement shortname;
	
	@FindBy(name="test_type")
	WebElement TestType;
	
	@FindBy(xpath="(//span[@class='select2-selection__arrow'])[1]")
	WebElement Categoryname;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement select;
	
	@FindBy(name="sub_category")
	WebElement subcategory;
	
	@FindBy(name="method")
	WebElement method;
	
	@FindBy(name="report_days")
	WebElement Report;
	
	@FindBy(name="charge_category_id")
	WebElement select1;
	
	@FindBy(xpath="(//option[@value='Blood sugar test'])[1]")
	WebElement charge;
	
	@FindBy(xpath="(//span[@class='select2-selection__arrow'])[3]")
	WebElement parameter;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement subcategory1;
	
	
	public  Pathology(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logincredentials() throws InterruptedException {
		pathology.click();
		AddpathologyTest.click();
		Thread.sleep(5000);
		name.sendKeys("sai");
		shortname.sendKeys("K");
		TestType.sendKeys("1234567");
		Thread.sleep(3000);
		Categoryname.click();
		select.sendKeys("Hematology");
		Thread.sleep(3000);
		select.click();
		subcategory.sendKeys("manual and Automation Testing");
		method.sendKeys("Agile");
		Report.sendKeys("30");
		Thread.sleep(2000);
		select1.click();
		charge.click();
		Thread.sleep(3000);
		parameter.click();
		subcategory1.sendKeys("vcv");
		
		
		
	}
	

}
