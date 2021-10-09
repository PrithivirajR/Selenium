package com.selenium_prt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class My_Store_Pt {

	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	driver.get("http://automationpractice.com/index.php");
	
	String title = driver.getTitle();
	System.out.println(title);

	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@class='login']")).click();
	
	WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	
	email.sendKeys("prithiviraj.1105@mail.com");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	
	WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
	firstname.sendKeys("Praveen");
	Thread.sleep(3000);

	WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
	lastname.sendKeys("Kumar");
	Thread.sleep(3000);

	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])"));
	
	password.sendKeys("prithiviraj");
	Thread.sleep(3000);

	WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
	Select s1 = new Select(day);
	s1.selectByValue("22");
	
	WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
	Select s2 = new Select(month);
	s2.selectByVisibleText("March ");
	
	WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
	Select s3 = new Select(year);
	s3.selectByIndex(25);
	
	WebElement text = driver.findElement(By.xpath("//label[text()='Sign up for our newsletter!']"));
	String text2 = text.getText();
	System.out.println(text2);
	
	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	
	WebElement text3 = driver.findElement(By.xpath("//label[text()='Receive special offers from our partners!']"));
	String text4 = text3.getText();	
	System.out.println(text4);
	
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	
	WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
	company.sendKeys("Ramkumar@co");
	
	WebElement text5 = driver.findElement(By.xpath("//span[text()='Street address, P.O. Box, Company name, etc.']"));
	String text6 = text5.getText();
	System.out.println(text6);
	
	WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
	address.sendKeys("2/8989,Sowndambigai nagar,Anna nagar");
	
	WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
	city.sendKeys("Tirupur");
	Thread.sleep(3000);
	
	WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
	Select s4 = new Select(state);
	s4.selectByIndex(15);
	
	WebElement postal = driver.findElement(By.xpath("//input[@name='postcode']"));
	postal.sendKeys("12356");
	
	WebElement text7 = driver.findElement(By.xpath("//textarea[@class='form-control']"));
	text7.sendKeys("Hi.....................!!!");
	
	WebElement mob = driver.findElement(By.xpath("//input[@name='phone']"));
	mob.sendKeys("8264917302");
	
	WebElement mobile = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
	mobile.sendKeys("8264917302");
	
	WebElement add = driver.findElement(By.xpath("//input[@name='alias']"));
	add.sendKeys("My address");
	
	driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@title='Home']")).click();
	
	}
}
