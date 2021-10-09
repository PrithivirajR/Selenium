package com.selenium_prt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

public class Dynamic_Xpath_Amazon {
	
	static int indexofmax , indexOfmin;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://www.myntra.com/men-tshirts");
				
		List<WebElement> discountPrice = driver.findElements
			(By.xpath
			("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
				
		List<Integer> priceList = new ArrayList<>(); 		// Empty List

		//iterate
		for(int i=0; i < discountPrice.size(); i++) {
			
			String text = discountPrice.get(i).getText().replace("Rs. ", "");
			
			int values = Integer.parseInt(text);
			
			priceList.add(values);
			
		}
		System.out.println(priceList);
		
		int size = priceList.size();
		
		System.out.println("Size : " + size);
		
		System.out.println("Maximum value : " + Collections.max(priceList));
		
		System.out.println("Minimum value : " + Collections.min(priceList));
		
		Integer max = Collections.max(priceList);
		
		Integer min = Collections.min(priceList);
		
		
	// ------------- To click the particular discount price amount ------------------------//
		// -----  1st method --------------------
//		for (int i = 0; i < size; i++) {
//			
//			if (priceList.get(i).equals(max)) {
//				
//				indexofmax = i;
//				System.out.println("Index of maximun price:"+ indexofmax);
//				discountPrice.get(i).click();
//				
//			} else if (priceList.get(i).equals(min)) {
//				
//				indexOfmin = i;
//				System.out.println("Index of minimum price:"+ indexOfmin);
//				discountPrice.get(i).click();
//				
//			}	
//		}
		
		
	// 2 nd methods ----------------------------
		
		for(int i=0; i < discountPrice.size(); i++) {
			
			String text = discountPrice.get(i).getText().replace("Rs. ", "");

		if (text.contains("509")) {
			
			WebElement ele = driver.
					findElement(By.xpath("(//span[@class='product-discountedPrice'])["+ (i+1) +"]"));
			ele.click();
			break;
		}
		int values = Integer.parseInt(text);
		
		priceList.add(values);
		}
		
		}
		
	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	