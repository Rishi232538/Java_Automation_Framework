package com.BaseClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Utility.ReadConfig;



public class BaseClass {

	public ReadConfig readconfig = new ReadConfig();

	public String baseUrl = readconfig.getApplication();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	
  
  @BeforeClass
  public void setup()
  {
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
	    driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get(baseUrl);

  }  
  
  
  
  @AfterClass
  public void tearDown()
  {
	  driver.quit();
  }


}
  
  



	
    

	
	
	
	
	
