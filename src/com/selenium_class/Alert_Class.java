package com.selenium_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
	//single alert
	
	driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
		
	Alert alert = driver.switchTo().alert();
	
	alert.accept();
	
	Thread.sleep(2000);

	//Confirm alert
	
	driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		
	driver.switchTo().alert().dismiss();
	
	Thread.sleep(5000);

	//Prompt alert
	driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
	
	
	Alert alert2 = driver.switchTo().alert();
	
	String text = alert2.getText();

	System.out.println(text);

	alert2.sendKeys("Hello.......");
	
	Thread.sleep(5000);
	
	alert2.accept();
	
	}

}
