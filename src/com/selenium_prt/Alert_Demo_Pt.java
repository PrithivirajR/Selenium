package com.selenium_prt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo_Pt {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.xpath("//button[text()='Click me']")).click();
	
	Alert alert = driver.switchTo().alert();
	
	alert.accept();
	
	driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
	
	Thread.sleep(8000);
	
	alert.accept();
	
	driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
	
	alert.dismiss();
	
	driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
	
	Alert alert2 = driver.switchTo().alert();
	
	String text = alert2.getText();

	System.out.println(text);

	alert2.sendKeys("Prithiviraj.......");
	
	Thread.sleep(5000);
	
	alert2.accept();
	
	}

}
