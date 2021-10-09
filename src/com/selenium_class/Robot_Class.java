package com.selenium_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Class {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
				
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(mobile).perform();
		
		Robot r = new Robot();
		
//	for (int i = 0; i < 5; i++) {
			
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
//		}
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		WebElement computers = driver.findElement(By.xpath("//a[normalize-space()='Computers']"));
		WebElement Electronics = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));

		
		
		
		
		
	}

}
