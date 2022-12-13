package com.Parabank_PageTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.Parabank_Pages.TC_002_LoginDetails;
import com.Parabank_Pages.TC_003_OpenNewAccount;
import com.Utility.ExcelUtils;
import com.Utility.WriteExcel;

public class TC_003_OpenNewAccount_Test extends BaseClass {
	
TC_002_LoginDetails id;
TC_003_OpenNewAccount oa;

    	
    ExcelUtils excel = new ExcelUtils();
	
   @Test
   public void Enter_the_username() throws IOException
   {
	id = new TC_002_LoginDetails();
	id.getUsername(username);
	id.getPassword(password);
	id.loginbutton();
	
   }

	@Test(priority = 2)
	public void OpenNewAccount() throws IOException
	{
		oa = new TC_003_OpenNewAccount();
		oa.getOpenNewAccount();
		oa.getChecking(excel.getCellDataString(12, 1));
		oa.getNewAccount(excel.getCellDataString(13, 1));
		oa.clickNewAccount();
	}
	
	//-------------------------------------------------------
	
	WriteExcel obj = new WriteExcel();
	
	@Test(priority = 3)
	
	public void Accountnumber_into_the_Excel() throws IOException
	{
		obj.writeExcel("Sheet2", oa.accountnum_into_excel(), 0, 0);
		
	}

	

}
