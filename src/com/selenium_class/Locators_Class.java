package com.selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Locators_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	//findelement--> Web element-->get single element
	//fineelements--> List<Webelement>----> get the group of elements
	//SendKeys----> Pass the input values
	//click --->click on elements
	
	//ID Locators
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("shreeeprithiviraj@gmail.com");
	
	//Name Locators
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("8870308622");
	
	Thread.sleep(5000);
	
	//Classname Locators
	WebElement loginBt = driver.findElement(By.name("login"));
	
	loginBt.clear();
	
	
	
	
	

	
	}

}
