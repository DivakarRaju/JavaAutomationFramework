package Selenium.Java.Project.seleniumjava;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class AppTest {
	
	private static WebDriver webdriver;
	private static AppiumDriver appdriver;
	
	
	public static WebDriver webdriver_initialize()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Ruby193\\bin\\chromedriver.exe");
		webdriver = new ChromeDriver();
		return webdriver;
	}
	
	

	public static AppiumDriver appiumdriver_initialize() throws MalformedURLException
	{
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("platform", "android");
		caps.setCapability("deviceName", "xyz");
		caps.setCapability("app", "E:\\divakar\\HOT_TOPIC\\HT_APP_NEW_REPO\\native_application\\torrid.apk");
		
		appdriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		return appdriver;
	}
	
	
	@Test
	public void apptestmethod() throws MalformedURLException{
		
	appdriver = AppTest.appiumdriver_initialize();
	}
	
}
