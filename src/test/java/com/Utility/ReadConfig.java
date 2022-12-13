package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig{

Properties prop;

public ReadConfig()

{
	File src = new File("D:\\Eclipse\\Parabank\\Configuration\\config.properties");
	
	try
	{
		FileInputStream fis = new FileInputStream(src);
		prop = new Properties();
		prop.load(fis);
	} 
	catch (Exception e) 
	{
		System.out.println("Exception is "+ e.getMessage());
	}
}

public String getApplication()
{
	String url = prop.getProperty("url");
	return url;
}

public String getUsername()
{
	String Login_Username = prop.getProperty("Login_Username");
	return Login_Username;
}

public String getPassword()
{
	String Login_Password = prop.getProperty("Login_Password");
	return Login_Password;
}


	
}
