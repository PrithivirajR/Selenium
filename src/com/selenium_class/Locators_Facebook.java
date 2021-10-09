package com.selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_Facebook {
	
		public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		
		//ID Locators
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("shreeeprithiviraj@gmail.com");
		
		//Name Locators
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("8870308622");
		
		//Classname Locators
//		WebElement loginBt = driver.findElement(By.name("login"));
//		
//		loginBt.click();
		
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
		
		WebElement mobilenumber = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]"));
		mobilenumber.sendKeys("8870308622");
		
		WebElement password1 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password1.sendKeys("prithi123446");
		
		//----------------------DropDown-----------------------------------------------
		//Single DropDown
		//Select ---> Class # Select s = new Select(Element); Return type void
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(day);
		s1.selectByValue("17");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(year);
		s3.selectByIndex(24);
		
		
		WebElement Fbtext = driver.findElement(By.xpath("//p[contains(text(),'By clicking Sign Up, you agree')]"));
		String text2 = Fbtext.getText();
		System.out.println(text2);
		
		//firstname.clear();
		
		}

}
