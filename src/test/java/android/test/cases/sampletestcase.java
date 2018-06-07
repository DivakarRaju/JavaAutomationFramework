package android.test.cases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import support.*;

public class sampletestcase {
	
	BrowserUtilities brutils = new BrowserUtilities();
	AppiumDriver<MobileElement> appdriver;
	WebDriver driver;
	
//	@Test
//	public void apptestmethod() throws MalformedURLException{
//		
//		appdriver= AppUtilities.appiumdriver_initialize();
//		appdriver.quit();
//	}
//	
	
	@Test
	public void webtestmethod() throws Exception{
		
		driver = BrowserUtilities.webdriver_initialize();
		driver.navigate().to("https://www.wikipedia.org/");
		System.out.println("navigating to wikipedia url");
		
		driver.manage().window().maximize();
		
		BrowserUtilities.webdriver_wait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id("js-link-box-en")));
		System.out.println("English element displayed");
		driver.findElement(By.id("js-link-box-en")).click();
		System.out.println("successfully clicked on english language");
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input#searchInput")).isDisplayed());
		System.out.println("successfuly verified the search field");	
		BrowserUtilities.webdriver_quit(driver);
	}
}