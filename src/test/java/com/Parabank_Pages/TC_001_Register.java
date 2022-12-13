package com.Parabank_Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;
import com.Utility.ExcelUtils;

public class TC_001_Register extends BaseClass {
	
	//Object Repositories---------------------------------
	
	@FindBy(xpath = "//*[text()='Register']")
	WebElement register;
	
	@FindBy(xpath = "//*[@id='customer.firstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//*[@id='customer.lastName']")
	WebElement lastname;
	
	@FindBy(xpath = "//*[@id='customer.address.street']")
	WebElement address;
	
	@FindBy(xpath = "//*[@id='customer.address.city']")
	WebElement city;
	
	@FindBy(xpath = "//*[@id='customer.address.state']")
	WebElement state;
	
	@FindBy(xpath = "//*[@id='customer.address.zipCode']")
	
	WebElement zipcode;
	
	@FindBy(xpath = "//*[@id='customer.phoneNumber']")
	WebElement phone;
	
	@FindBy(xpath = "//*[@id='customer.ssn']")
	WebElement ssn;
	
	@FindBy(xpath = "//*[@id='customer.username']")
	WebElement username;
	
	@FindBy(xpath = "//*[@id='customer.password']")
	WebElement password;
	
	@FindBy (xpath = "//*[@id='repeatedPassword']")
	WebElement Confirm_password;
	
	@FindBy (xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	WebElement click_on_register;
	
	//----------------PageFactory------------------
	
	public TC_001_Register() throws IOException 
	{
		super();
		PageFactory.initElements(driver, this);
	}
	//----------------------------------------------

	public void getRegister() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		register.click();
	}

	public void getFirstname(String Firstname) {
		firstname.sendKeys(Firstname);
	}

	public void getLastname(String Lastname) {
		lastname.sendKeys(Lastname);
	}

	public void getAddress(String CurrentAddress) {
		address.sendKeys(CurrentAddress);
	}

	public void getCity(String CurrentCity) {
		city.sendKeys(CurrentCity);
	}

	public void getState(String CurrentState) {
		state.sendKeys(CurrentState);
	}

	
	public void getZipcode(String CurrentZipcode) {
		zipcode.sendKeys(CurrentZipcode);
	}

	public void getPhone(String CurrentPhonenumber) {
		phone.sendKeys(CurrentPhonenumber);
	}

	public void getSsn(String CurrentSSN) {
		ssn.sendKeys(CurrentSSN);
	}

	public void getUsername(String Current_Username) {
		username.sendKeys(Current_Username);
	}
	
	public void getPassword(String Current_Password){
		password.sendKeys(Current_Password);
	}

	public void getConfirmPassword(String ConfirmPassword) {
		Confirm_password.sendKeys(ConfirmPassword);
	}
	
	public void getConfirmRegister() {
		click_on_register.click();
	}




	//--------------------------------------------
	
	

}
