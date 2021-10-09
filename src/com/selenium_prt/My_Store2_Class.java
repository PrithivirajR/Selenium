package com.selenium_prt;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class My_Store2_Class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		String windowHandle = driver.getWindowHandle();

		String title = driver.switchTo().window(windowHandle).getTitle();

		System.out.println(title);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='login']")).click();

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("prithiviraj.15@mail.com");

		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		password.sendKeys("prithiviraj");

		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();

		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[normalize-space()='Evening Dresses'])[3]")).click();

		WebElement quickview = driver.findElement(
				By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=4&controller=product'])[2]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", quickview);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//		driver.switchTo().frame(frame);

		WebElement Qty = driver.findElement(By.cssSelector("[class$='quantity_up']"));
		for (int i = 0; i < 9; i++) {
			Qty.click();
		}

		WebElement size = driver.findElement(By.id("group_1"));
		Select s1 = new Select(size);
		s1.selectByIndex(2);

		driver.findElement(By.xpath("//a[@name='Pink']")).click();
		Thread.sleep(3000);
		
		WebElement ok = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		Actions act = new Actions(driver);
		act.click(ok).build().perform();
		// Screenshot
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\Screenshot\\snap2.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();

		js.executeScript("window.scrollBy(0, 500);");

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\Screenshot\\snap3.png");
		FileUtils.copyFile(src1, dest1);

		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();

		js.executeScript("window.scrollBy(0, 500);");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File src2 = ts1.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\Screenshot\\snap4.png");
		FileUtils.copyFile(src2, dest2);

		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();

		js.executeScript("window.scrollBy(0, 500);");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File src3 = ts1.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\Screenshot\\snap5.png");
		FileUtils.copyFile(src3, dest3);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"))
				.click();

		js.executeScript("window.scrollBy(0, 500);");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File src4 = ts1.getScreenshotAs(OutputType.FILE);
		File dest4 = new File("C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\Screenshot\\snap6.png");
		FileUtils.copyFile(src4, dest4);

		driver.findElement(By.xpath("//a[@class='bankwire']")).click();

		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();

		js.executeScript("window.scrollBy(0, 500);");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot ts5 = (TakesScreenshot) driver;
		File src5 = ts1.getScreenshotAs(OutputType.FILE);
		File dest5 = new File("C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\Screenshot\\snap7.png");
		FileUtils.copyFile(src5, dest5);
	}

}
