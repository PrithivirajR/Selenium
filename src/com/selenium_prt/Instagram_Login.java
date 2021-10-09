package com.selenium_prt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Instagram_Login {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//h1[text()='Instagram']")).getText();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("8870308622");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("9047177644");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//div[@role='button'])[18]")).click();
		Thread.sleep(14000);
		
		driver.findElement(By.xpath("(//div[@role='button'])[24]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[@class='FY9nT']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//img[@class='_6q-tv'])[38]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//a[@class='-qQT3'])[1]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//button[@class='IalUJ '])")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//button[@class='aOOlW   HoLwm '])")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
		Thread.sleep(4000);

		WebElement website = driver.findElement(By.id("pepWebsite"));
		website.sendKeys("www.prithiviraj.com");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//div[@class='XrOey'])[1]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//div[@class='XrOey'])[5]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[text()='Log Out']")).click();	
		
	}

}
