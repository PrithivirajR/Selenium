package com.selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath_Class {
	
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	driver.get("https://www.javatpoint.com/java-tutorial");
	
	// Absolute Xpath - h1 tag
	
	Thread.sleep(3000);
	
	WebElement java = driver.findElement(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h1"));
	
	System.out.println(java.getText());
	
	Thread.sleep(3000);
	System.out.println("----------------------------------------------------");
	
	// Absolute Xpath - h2 tag 

	List<WebElement> text = driver.findElements(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h2"));
	
	// Iterate 
	Thread.sleep(3000);

	for (WebElement ite : text) {
		
		System.out.println(ite.getText());
	}
	}

}
