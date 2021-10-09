package com.selenium_class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot_Class {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		// Convert web driver object to TakeScreenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		// Call getScreenshotAs method to create image file
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// create a file file Location
		
		File dest = new File("C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\Screenshot\\snap1.png");
		
		// Copy file to Desired Location
		
		FileUtils.copyFile(src, dest);
		
	}

}
