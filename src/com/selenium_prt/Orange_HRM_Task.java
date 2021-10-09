package com.selenium_prt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange_HRM_Task {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.xpath("//span[text()='( Username : Admin | Password : admin123 )']"));
		
		String text = username.getText();
		//System.out.println(text);
		String s1 = text.substring(13, 18);
		
		String s2 = text.substring(32, 40);
		
		System.out.println("***************************************");
		System.out.println("Login User name is : " + s1);
		System.out.println("Login Password is : " + s2);
		System.out.println("***************************************");
		
		driver.findElement(By.id("txtUsername")).sendKeys(s1);
		driver.findElement(By.id("txtPassword")).sendKeys(s2);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		WebElement role = driver.findElement(By.id("systemUser_userType"));
		Select s = new Select(role);
		s.selectByVisibleText("ESS");
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Peter Mac Anderson");
		driver.findElement(By.id("systemUser_userName")).sendKeys("padmavathi");
		WebElement status = driver.findElement(By.id("systemUser_status"));
		Select ss = new Select(status);
		ss.selectByVisibleText("Enabled");
		
		driver.findElement(By.id("systemUser_password")).sendKeys("prithivi123@1998");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("prithivi123@1998");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(5000);

		List<WebElement> header = driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th"));
		for (int i = 0; i < header.size(); i++) {
			
			String text2 = header.get(i).getText();
			//System.out.println(text2);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++) {
			
			List<WebElement> data = rows.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < data.size(); j++) {
				
				if (data.get(j).getText().equalsIgnoreCase("padmavathi")) {
					
					System.out.println("User name:" + data.get(1).getText());
					System.out.println("User role:" + data.get(2).getText());
					System.out.println("Employee name:" + data.get(3).getText());
					System.out.println("status:" + data.get(4).getText());
				}
			}
			
		}
	}

}
