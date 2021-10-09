package com.selenium_class;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	WebElement state = driver.findElement(By.xpath("//select[@name='States']"));
	
	Select s = new Select(state);
	
	// Multiple DropDwon
	
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
	System.out.println("-------------------------------------");
	//s.getoptions-----------------------------------------
	
	List<WebElement> options = s.getOptions();
	//System.out.println(options);  --> it gives only id location or id elements path, 
	// to use iteration or for each loop for result of options.....
	
	//Iterate - using iterator function
	Iterator<WebElement> ite = options.iterator(); // get input function
	
	// gettext() function
	
	while (ite.hasNext()) { // hasNext()--> Iterate with multiple value with boolean function
		
		WebElement ste = ite.next(); // next()--> It iterate the next values
		String text = ste.getText();
		System.out.println(text);	
	}
	
	// getAllselectoptions()-----------------------------------------
	
	System.out.println("---------------------------------");

	s.selectByValue("California");
	s.selectByValue("New York");
	s.selectByIndex(5);
	s.selectByValue("Washington");
	
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	
	//Iterate	
	for (WebElement all : allSelectedOptions) {
		String all1 = all.getText();
		System.out.println(all1);
	}
	
	// getFirstselectoptions() ---------------------------------------
	
	System.out.println("-----------------------------------");
	WebElement first = s.getFirstSelectedOption();
	String first1 = first.getText();
	System.out.println(first1);
	
	//deselectAll()	-------------------------------------
		
	s.deselectByValue("New York");
//	s.deselectAll();
	
	
}}

