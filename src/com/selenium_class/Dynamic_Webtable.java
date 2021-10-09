package com.selenium_class;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {
	static int indexOfTotalCase, indexOfTotalRecovered, indexOfActiveCase;

	static String country = "India";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.worldometers.info/coronavirus/#main_table");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		java.util.List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		//iterate
		
		for(int i = 0; i < allHeaders.size(); i++) {
			
			String text = allHeaders.get(i).getText();
			
			String headers = text.replace("\n", " ");
			
			System.out.println(headers);
			
			if(headers.equalsIgnoreCase("Total Cases")) {
				
				indexOfTotalCase = i;
				
				System.out.println("Total Case index value is : " + indexOfTotalCase);
				
			}else if (headers.equalsIgnoreCase("Total Recovered")) {
			
				indexOfTotalRecovered = i;
				
				System.out.println("Total Recovered Case index value : " + indexOfTotalRecovered);
				
			}else if (headers.equalsIgnoreCase("Active Cases")) {
			 
				indexOfActiveCase = i;
				
				System.out.println("Active Case index value : " + indexOfActiveCase);
			}
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//traverse into table body
		
		//get the row
		
		java.util.List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		
		//Iterate Rows
		
		for (int i = 0; i < allRows.size();i++) {
			
			//get table data
			
		 java.util.List<WebElement> allData = driver.findElements(By.tagName("td"));
		   //Iterate Data
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		   for(int j = 0; j < allData.size(); j++) {
			   
			   if(allData.get(j).getText().equalsIgnoreCase(country)) {
				   
				   System.out.println(country);
				   
				   System.out.println("Total Case : " + allData.get(indexOfTotalCase).getText());
				   
				   System.out.println("Recovered Case : " + allData.get(indexOfTotalRecovered).getText());
				   
				   System.out.println("Active Case : " + allData.get(indexOfActiveCase).getText());
				   
				   System.exit(0);
			  }
		   }
	    }
	}
}