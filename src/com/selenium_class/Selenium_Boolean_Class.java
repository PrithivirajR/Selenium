package com.selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Boolean_Class {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	driver.get("https://en-gb.facebook.com/");
	WebElement creatBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	creatBtn.click();
	Thread.sleep(5000);
	
	WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	firstname.sendKeys("prithivi");
	
	WebElement secondname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	secondname.sendKeys("raj");
	
	WebElement moblie = driver.findElement(By.xpath("//div[text()='Mobile number or email address']"));
	String text = moblie.getText();
	System.out.println(text);
		
	boolean displayed = driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).isDisplayed();
	System.out.println(displayed);
		
	WebElement mobilenumber = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]"));
	mobilenumber.sendKeys("8870308622");
		
		
	boolean selected = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]")).isSelected();
	System.out.println(selected);
	
	boolean enabled = driver.findElement(By.xpath("//select[@id='day']")).isEnabled();
	System.out.println(enabled);
		
	}
}
