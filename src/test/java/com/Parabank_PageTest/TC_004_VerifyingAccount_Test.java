package com.Parabank_PageTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.Parabank_Pages.TC_002_LoginDetails;
import com.Parabank_Pages.TC_004_VerifyingAccount;
import com.Utility.ExcelUtils;

public class TC_004_VerifyingAccount_Test extends BaseClass{
	
	TC_002_LoginDetails id;
	TC_004_VerifyingAccount va;
	
	  @Test
	   public void Enter_the_username() throws IOException
	   {
		id = new TC_002_LoginDetails();
		id.getUsername(username);
		id.getPassword(password);
		id.loginbutton();
		
	   }
	  
	  ExcelUtils excel = new ExcelUtils();
	  
	  @Test(priority = 2)
		public void VerfyingAcount() throws IOException
		{
			va = new TC_004_VerifyingAccount();
			va.getOpenNewAccount();
			va.getChecking(excel.getCellDataString(12, 1));
			va.getNewAccount(excel.getCellDataString(13, 1));
			va.clickNewAccount();
			va.VerfyingAcount();
		}

}
