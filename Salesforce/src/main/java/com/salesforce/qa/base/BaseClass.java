package com.salesforce.qa.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements ISeleniumBaseDesign{

	public static WebDriver driver;	

	@BeforeTest
	public RemoteWebDriver launchBrowser() {
		// TODO Auto-generated method stub
		return null;
	}

	@BeforeTest
	public RemoteWebDriver launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			ChromeOptions opt = new ChromeOptions(); 	  
			opt.addArguments("--disable-notifications"); 
			driver = new ChromeDriver(opt); 

		} else if (browser.equalsIgnoreCase("FF")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions optf = new FirefoxOptions();
			optf.addArguments("--disable-notifications"); 
			driver = new FirefoxDriver(optf);

		}

		return null;
	}

	
	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {


	}

	public void open(String aut) {

		driver.get(aut);

	}

	public enum Locator{

		id,name,className,xpath;
	}

	public WebElement getWebElement(String locator) {

		String[] arr = locator.split("=",2);
		String key = arr[0];
		String value = arr[1];
		Locator loc = Locator.valueOf(key.toLowerCase());

		switch(loc) {

		case id:
			driver.findElement(By.id(value));
			break;
		case name:
			driver.findElement(By.name(value));
			break;
		case className:
			driver.findElement(By.className(value));
		case xpath:
			driver.findElement(By.xpath(value));
		default:

		}

		return null;
	}


	public List<WebElement> getWebElements(String locator) {

		return null;
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys();

	}

	public void click(WebElement ele) {

		ele.click();

	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

}
