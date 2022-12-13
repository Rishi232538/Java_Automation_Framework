package com.Parabank_Pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.BaseClass.BaseClass;


public class TC_002_LoginDetails extends BaseClass{
	

	
	//Object Repositories---------------------------------
	
	@FindBy (xpath = "//input[@name='username']")
	@CacheLookup
	WebElement Username;
	
	@FindBy (xpath = "//input[@name='password']")
	@CacheLookup
	WebElement Password;
	
	@FindBy (xpath = "//input[@class='button']")
	@CacheLookup
	WebElement LoginButton;
	
	//----------------PageFactory------------------
	
	public TC_002_LoginDetails() throws IOException 
	{
		super();
		PageFactory.initElements(driver, this);
	}

	//--------------------------------------------
	public void getUsername(String username)
	{
		
		Username.sendKeys(username);
	}


	public void getPassword(String password)
	{
		Password.sendKeys(password);
	}

	public void loginbutton()
	{
		LoginButton.click();
	}
	
	
	//--------------------------------------------------
	
	
	
	



}
