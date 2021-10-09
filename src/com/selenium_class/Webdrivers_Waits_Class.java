package com.selenium_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdrivers_Waits_Class {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	driver.get("https://en-gb.facebook.com/");
	
	// ----------Wait concept -----------------------------------------------------
	
	WebElement creatBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	creatBtn.click();
	
	
	//Thread.sleep(5000); --> Only for static wait 
	
	// ------------------Implicit Wait-----------------------------------------------------
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	firstname.sendKeys("prithivi");
	
	//--------------------------Explicit Wait----------------------------------------------
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(firstname));	
	
	WebElement secondname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	secondname.sendKeys("raj");
	
	//------------------------Fluent Wait ----------------------------------------------------
	
	Wait wait1 = new FluentWait(driver)
			.withTimeout(30,TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
			.ignoring(Exception.class);
	
	WebElement moblie = driver.findElement(By.xpath("//div[text()='Mobile number or email address']"));
	String text = moblie.getText();
	System.out.println(text);
	
	WebElement mobilenumber = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]"));
	mobilenumber.sendKeys("8870308622");
	
	WebElement password1 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	password1.sendKeys("prithi123446");
	}
}
