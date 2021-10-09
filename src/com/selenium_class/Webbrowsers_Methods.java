package com.selenium_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webbrowsers_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
	   "C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		//get() - launch a new browser and opens the given url
		driver.get("https://www.amazon.in/");
		
		//.getTitle() - return the given page title
		String title = driver.getTitle();
		System.out.println(title);
		
		//.getCurrentUrl - return the current page url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//.getPageSouse - return current page sourse code(program)
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		//Navigate methods
		//to - navigate to given Url
		driver.navigate().to("https://www.google.in/");
		
		//back - back to the previous page Url
		driver.navigate().back();
		
		// forward - forward to the next page of the Url
		driver.navigate().forward();
		
		// refresh - it refresh the current pade of the Url
		driver.navigate().refresh();
		
		driver.close();
	//	driver.quit();
		
		
		
		
		
		
	}
}
