package android.test.cases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import Selenium.Java.Project.seleniumjava.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class sampletestcase {
	
	

	
	@Test
	public void apptestmethod() throws MalformedURLException{
		
		AppiumDriver<MobileElement> appdriver= AppUtilities.appiumdriver_initialize();
		
		appdriver.quit();
	}
   

}
