package android.test.cases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import support.*;

public class sampletestcase {
	
	AppiumDriver<MobileElement> appdriver;
	
	@Test
	public void apptestmethod() throws MalformedURLException{
		
		appdriver= AppUtilities.appiumdriver_initialize();
		appdriver.quit();
	}
}
;