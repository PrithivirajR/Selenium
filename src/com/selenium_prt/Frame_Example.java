package com.selenium_prt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Example {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/frames");
		
		WebElement findElement = driver.findElement(By.xpath("//iframe[@src='/sample']"));
		
		driver.switchTo().frame(findElement);
		
		WebElement text1 = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		
		String t1 = text1.getText();
		
		System.out.println(t1);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		WebElement findElement2 = driver.findElement(By.xpath("(//iframe[@src='/sample'])[2]"));
		
		driver.switchTo().frame(findElement2);
		
		WebElement text2 = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		
		String t2 = text2.getText();
		
		System.out.println(t2);
	}

}
