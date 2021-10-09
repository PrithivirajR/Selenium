package com.selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector_Class {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");
		
		// id locator - #
		
		WebElement email = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy"));
		email.sendKeys("viji@gmail.com");
		
		// class locator - .
		
		WebElement password = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
		password.sendKeys("9632145870");
		
		// Locate by Name or any attribute - =
		
		WebElement creatac = driver.findElement(By.cssSelector("[rel='async']"));
		creatac.click();
		
		Thread.sleep(5000);
		
		// Match with Prefix - ^

		WebElement firstname = driver.findElement(By.cssSelector("[name^='firstname']"));
		firstname.sendKeys("Ram");
		
		// Match with Suffix - $
		
		WebElement surename = driver.findElement(By.cssSelector("[name$='lastname']"));
		surename.sendKeys("ragul");
		
		// Match with SubString or Contains- *=
		
		WebElement email1 = driver.findElement(By.cssSelector("[aria-label*='ile number or email ad']"));
		email1.sendKeys("anuram@gmail.com");
		
		WebElement email2 = driver.findElement(By.cssSelector("[aria-label*='enter email']"));
		email2.sendKeys("anuram@gmail.com");
		
		WebElement pass =driver.findElement(By.cssSelector("[autocomplete='new-password']"));
		pass.sendKeys("987643210");
	}
}
