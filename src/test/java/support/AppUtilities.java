package support;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppUtilities {
	
	private static AppiumDriver<MobileElement> appdriver;
	
	public static AppiumDriver<MobileElement> appiumdriver_initialize() 
	{
		try {
			appdriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), AppUtilities.get_app_capabilities());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return appdriver;
	}
	
	public static DesiredCapabilities get_app_capabilities()
	{
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("platform", "android");
		caps.setCapability("deviceName", "xyz");
		caps.setCapability("app", "E:\\divakar\\HOT_TOPIC\\HT_APP_NEW_REPO\\native_application\\torrid.apk");
		return caps;
	}

}
