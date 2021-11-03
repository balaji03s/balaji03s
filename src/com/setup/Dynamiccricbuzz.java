package com.setup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamiccricbuzz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Seleniumsetup\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/points-table");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> Header = driver.findElements(By.xpath("//table[@class='table']/thread/tr/th"));
		
		
		for(int i=0;i<Header.size();i++) {
			String text = Header.get(i).getText();
			System.out.println(text);
			
		}
		
	
	
	
	
	}
}
