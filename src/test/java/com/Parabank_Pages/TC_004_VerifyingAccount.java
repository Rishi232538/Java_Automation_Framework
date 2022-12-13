package com.Parabank_Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.BaseClass.BaseClass;

public class TC_004_VerifyingAccount extends BaseClass{

	//Object Repositories---------------------------------
	
	@FindBy (xpath = "//a[text()='Open New Account']")
	@CacheLookup
	WebElement OpenNewAccount;
	
	@FindBy (xpath = "//*[@id='type']")
	@CacheLookup
	WebElement checking;
	
	@FindBy (xpath = "//*[@id='fromAccountId']")
	@CacheLookup
	WebElement newAccount;
	
	@FindBy(css = "input.button")
	@CacheLookup
	WebElement openNewAccount;
	
	@FindBy(xpath = "//*[text()='Congratulations, your account is now open.']")
	@CacheLookup
	WebElement Actual_Title;
	
	@FindBy (xpath = "//*[@id='newAccountId']")
	@CacheLookup
	WebElement accountnumber;
	
	//----------------PageFactory------------------
	
	public TC_004_VerifyingAccount() throws IOException 
	{
		super();
		PageFactory.initElements(driver, this);
	}

	//---------------------------------------------
	
	public void getOpenNewAccount() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		OpenNewAccount.click();
	}

	public void getChecking(String value) {
		 
		 Select select=new Select(checking);
		  select.selectByVisibleText(value);
	}


	public void getNewAccount(String Accountvalue) {
		
		Select s=new Select(newAccount);
		s.selectByVisibleText(Accountvalue);
	}

	public void clickNewAccount()
	{
		openNewAccount.click();
	}

	
	public void VerfyingAcount()
	{
		String ExpectedTitle = "Congratulations, your account is now open.";
		
		 String ActualTitle = Actual_Title.getText(); 
		 
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}
}
