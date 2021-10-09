package com.selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Frame_types {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Frames.html");

		int size = driver.findElements(By.tagName("iframe")).size();

		System.out.println(size);

		// iframe ---> id or name or webelement

		driver.switchTo().frame("singleframe");

		WebElement input1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		input1.sendKeys("Hello frame....");
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent(); //---> it used to return to the main page from any DOM str

		WebElement nesstedframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));

		nesstedframe.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(innerframe);
		
		WebElement input2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		input2.sendKeys("Hello java..");

	}

}
