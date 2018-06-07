package support;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtilities {
	
	private static WebDriver webdriver;

	public static WebDriver webdriver_initialize()
	{
		try{
			System.setProperty("webdriver.chrome.driver","C:\\Ruby193\\bin\\chromedriver.exe");
			webdriver = new ChromeDriver();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return webdriver;
	}
	
}
