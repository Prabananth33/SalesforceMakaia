package com.salesforce.qa.base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface ISeleniumBaseDesign {
	
	/**
	 * This method will launch the chrome browser in the local environment
	 * maximize the browser
	 * @return - return type of this method is object of RemoteWebDriver
	 * @author Karthikeyan Rajendran
	 * @exception - Exception
	 */
	public RemoteWebDriver launchBrowser();
		
	/**
	 * This method will launch the given browser in both local and gird environment
	 * maximize the browser  
	 * @param browser - This will launch browser which will pass in the parameter	 
	 * @author Karthikeyan Rajendran
	 * @exception ConnectionClosedException, UnreachableBrowserException, RemoteDriverServerException, MalformedURLException, UnknownHostException
	 */
	public RemoteWebDriver launchBrowser(String browser);
	
	/**
	 * This method will close the active browser	 
	 * @author Karthikeyan Rajendran
	 * @exception Exception
	 */
	public void closeBrowser();
	
	/**
	 * This method will close all the browsers	 
	 * @author Karthikeyan Rajendran 
	 * @exception Exception
	 */
	public void quitBrowser();
	
	/**
	 * This method will launch the Chrome browser and
	 * maximize the browser and set the wait for 30 seconds
	 * and load the url
	 * @param aut - This will load the url of the application	 
	 * @author Karthikeyan Rajendran
	 * @exception MalformedURLException
	 */
	public void open(String aut);
	
	/**
	 * This method is used get single web element from DOM
	 * @param locator - This argument has element type = element value in the DOM
	 * @return single web element
	 * @author Karthikeyan Rajendran
	 */
	public WebElement getWebElement(String locator);
	
	/**
	 * This method is used get multiple web elements from DOM
	 * @param locator - This argument has element type = element value in the DOM
	 * @return list of we elements
	 * @author Karthikeyan Rajendran
	 */
	public List<WebElement> getWebElements(String locator);
	
	/**
	 * This method is used to enter the given value in the text box kind of element
	 * @param ele - This argument has the web element which need to handle
	 * @param data - This argument has value which need to enter into the web element which need to handle
	 * @author Karthikeyan Rajendran
	 */
	public void type(WebElement ele, String data);
	
	/**
	 * This method is used to click on the give element in the DOM
	 * @param ele - This argument has the web element which need to handle
	 * @author Karthikeyan Rajendran
	 */
	public void click(WebElement ele);
	
	/**
	 * This method is used to get text from the given element
	 * @param ele - This argument has the web element which need to handle
	 * @return string value
	 * @author Karthikeyan Rajendran
	 */
	public String getText(WebElement ele);

}