package com.selenium_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath_Class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//get() ---> launch a new browser and opens the given URL
		
		driver.get("https://www.myntra.com/men-tshirts");
		
		//Dynaamic Xpath
		
		List<WebElement> discountPrice = driver.findElements
			(By.xpath
			("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		
		// Empty List
		
		List<Integer> priceList = new ArrayList<>(); 
		
		//iterate
		
		for(int i=0; i < discountPrice.size(); i++) {
			
			String text = discountPrice.get(i).getText().replace("Rs. ", "");
			
			int values = Integer.parseInt(text);
			
			priceList.add(values);
			
		//	System.out.println(text);
			
		}
		
		System.out.println(priceList);
		
		int size = priceList.size();
		
		System.out.println("Size : " + size);
		
		System.out.println("Maximum value : " + Collections.max(priceList));
		
		System.out.println("Minimum value : " + Collections.min(priceList));
		
	}
}
