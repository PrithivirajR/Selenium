package com.selenium_prt;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Ipl_Table {

	static String Team = "Chennai Super Kings"; 
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.iplt20.com/points-table/men/2021");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> allHeaders = 
				driver.findElements(By.xpath("//table[@class='standings-table standings-table--full ']/thead/tr"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> allrows = driver.findElements(By.xpath("//table[@class='standings-table standings-table--full ']/tbody/tr"));
		
		for (int i = 0; i < allrows.size();i++) {
								
			List<WebElement> allData = allrows.get(i).findElements(By.tagName("td"));
		   
		   for(int j = 0; j < allData.size(); j++) {
			   
			   if(allData.get(j).getText().equalsIgnoreCase(Team)) {
				   
				   System.out.println(Team);
				   
				   System.out.println("Total Lose : " + allData.get(4).getText());
				   
				   System.out.println("The NRR : " + allData.get(7).getText());
				   
				   System.out.println("Total Points : " + allData.get(10).getText());
			 
			  }
		   }
	    }
	}
}


