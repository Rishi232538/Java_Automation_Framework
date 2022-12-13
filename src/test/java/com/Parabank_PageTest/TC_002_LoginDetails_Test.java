package com.Parabank_PageTest;

import java.io.IOException;
import org.testng.annotations.Test;
import com.BaseClass.BaseClass;
import com.Parabank_Pages.TC_002_LoginDetails;


public class TC_002_LoginDetails_Test extends BaseClass {

	TC_002_LoginDetails id;
	
	
	
	@Test(priority = 1)
	public void Enter_the_credentials() throws IOException
	{
		id = new TC_002_LoginDetails();
		id.getUsername(username);
		id.getPassword(password);
		id.loginbutton();
	}


}
