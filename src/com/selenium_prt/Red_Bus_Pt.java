package com.selenium_prt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_Bus_Pt {
	
	public static void main(String[] args) throws Throwable {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		
		Thread.sleep(2000);
		
		WebElement findElement = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		
		driver.switchTo().frame(findElement);
		
		WebElement mobile = driver.findElement(By.xpath("//input[@type='number']"));
		
		mobile.sendKeys("8870308622");
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
	}

}
