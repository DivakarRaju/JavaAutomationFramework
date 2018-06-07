package support;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {
	
	private static WebDriver webdriver;

	public static WebDriver webdriver_initialize()
	{
		try{
			System.setProperty("webdriver.chrome.driver","F:\\Programming\\Divakar\\Testing\\webdrivers\\chromedriver.exe");
			webdriver = new ChromeDriver();
			System.out.println("started the web driver");
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return webdriver;
	}
	
	public static void webdriver_quit(WebDriver driver)
	{
		System.out.println("quiting web driver");
		driver.quit();
	}
	
	public static WebDriverWait webdriver_wait(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver, 20);
		return wait;
	}
	
	
}
