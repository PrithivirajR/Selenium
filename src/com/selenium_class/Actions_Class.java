package com.selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//------------ Click actions-----------------------------------------------------------

//		driver.get("https://demoqa.com/buttons");
//		
//		Actions act = new Actions(driver);
//		
//		WebElement dynamicclick = driver.findElement(By.xpath("//button[text()='Click Me']"));
//
//		act.click(dynamicclick).perform();
//		
//		WebElement rightclick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
//		
//		act.contextClick(rightclick).build().perform();
//		
//		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
//		
//		act.doubleClick(doubleclick).perform();
		
		//----------------------------------------- move to actions -----------------------------
		
//		driver.get("https://www.amazon.in/");
//		
//		Actions act = new Actions(driver);
//		
//		WebElement about = driver.findElement(By.xpath("//a[text()='About Us']"));
//		
//		act.moveToElement(about).perform();
//		
//		Thread.sleep(3000);
//		
//		act.contextClick(about).perform();
		
		// ------------------------------------------ drag and drop action ----------------------------
		
		driver.get("https://demoqa.com/droppable");
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement target = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		act.dragAndDrop(source, target).perform();
		
		
		
		
	}

}
