package com.selenium_prt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gmail {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	driver.get("https://accounts.google.com/");
	
	Thread.sleep(3000);
	
	WebElement mail = driver.findElement(By.xpath("//input[@id='identifierId']"));
	mail.sendKeys("prithivirajtup.1998@gmail.com");
	
	Thread.sleep(3000);

	driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]")).click();
	Thread.sleep(3000);

	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("9047177644padma");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("(//span[contains(text(),'Confirm')])[1]")).click();
	
	
	
	
	
	
	
	
	
	}

}
