package com.Parabank_PageTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.Parabank_Pages.TC_001_Register;
import com.Utility.ExcelUtils;


public class TC_001_Register_Test extends BaseClass {

	TC_001_Register reg;
	
	ExcelUtils excel = new ExcelUtils();
	
	@Test(priority = 1)
	public void register() throws IOException
	{
		
		
		reg = new TC_001_Register();
		reg.getRegister();
		reg.getFirstname(excel.getCellDataString(0, 1));
		reg.getLastname(excel.getCellDataString(1, 1));
		reg.getAddress(excel.getCellDataString(2, 1));
		reg.getCity(excel.getCellDataString(3, 1));
		reg.getState(excel.getCellDataString(4, 1));
		reg.getZipcode(excel.getCellDataString(5, 1));
		reg.getPhone(excel.getCellDataString(6, 1));
		reg.getSsn(excel.getCellDataString(7, 1));
		reg.getUsername(excel.getCellDataString(8, 1));
		reg.getPassword(excel.getCellDataString(9, 1));
		reg.getConfirmPassword(excel.getCellDataString(10, 1));
		reg.getConfirmRegister();
		
		
	}
	
	
}
