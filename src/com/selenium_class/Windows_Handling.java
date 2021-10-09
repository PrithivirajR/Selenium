package com.selenium_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

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
			
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		WebElement electronics = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
		
		act.contextClick(electronics).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);

		WebElement computer = driver.findElement(By.xpath("//a[normalize-space()='Computers']"));
		
		act.contextClick(computer).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
	// --------------- Windows Handling ------------------------------------//
		
		// getWindowHandle() --> return parent or current window id
		
//		String windowHandle = driver.getWindowHandle();
//		
//		String title = driver.switchTo().window(windowHandle).getTitle();
//		
//		System.out.println(title);
//		
		
		// getWindowHandles() --> return all active window id
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		// Iterate
		
		for (String str : windowHandles) {
			
			String active = driver.switchTo().window(str).getTitle();
			
			System.out.println(active);
			
			Thread.sleep(3000);
			
		}
		Thread.sleep(5000);

		//Iterate 
	
		String s ="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		
		for (String str : windowHandles) {
			
			if (driver.switchTo().window(str).getTitle().equals(s)) {
				
				break;
			}
			
		}
		
		driver.findElement(By.xpath("//span[normalize-space()='Accessories']")).click();
//		
//		java.util.Iterator<String> ite = windowHandles.iterator();
//		while (ite.hasNext()) {
//			
//			String next = ite.next();
//			
//			String title = driver.switchTo().window(next).getTitle();
//			
//			System.out.println(title);
//			
//		}
		
//	 String amazon = ite.next();
//	 
//	 String computer1 = ite.next();
//	 
//	 String elet = ite.next();
//	 
//	 String  mob = ite.next();
//	 
//	 driver.switchTo().window(mob);
//	 
		
	}
}
