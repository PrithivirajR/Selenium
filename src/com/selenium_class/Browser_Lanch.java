package com.selenium_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Lanch {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", 
	  "C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");
		
		//interface				//class			----> Multiple inheritance
	
		WebDriver driver = new ChromeDriver(); 
		//parent class			//child class	----> Upcasting 
		
		ChromeDriver driver1 = new ChromeDriver();
		
		driver.get("https://www.google.com/"); // we access diff web browsers like firebox,google,ie 
		
		driver1.get("https://www.google.com/"); // we access only google 
	}

}

