package com.selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor_Class {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));

		//mobile.click(); ---> Webelement methods
		
		JavascriptExecutor js = (JavascriptExecutor) driver; //--> Narrowing type casting
		
		js.executeScript("arguments[0].click();", mobile); 
		
		js.executeScript("window.scrollBy(0, 6000);");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, -5000);");
				
		WebElement shop = driver.findElement(By.xpath("//h2[text()='Shop by feature']"));

		js.executeScript("arguments[0].scrollIntoView();", shop);
		
		js.executeScript("alert('Hi world');"); 

	}
}
