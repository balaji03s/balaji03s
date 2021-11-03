package com.setup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Seleniumsetup\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
		List<WebElement> dprice = driver.findElements(By.xpath("//span[@class='product-strike']//preceding::span[@class='product-discountedPrice']"));
		
		List<Integer> pricelist= new ArrayList<>();
		
		for(int i=0;i<dprice.size();i++) {
			String text = dprice.get(i).getText().replace("Rs. ", "");
			int value=Integer.parseInt(text);
			pricelist.add(value);
			// System.out.println(text);
			}
		System.out.println(pricelist);
		int size=pricelist.size();
		System.out.println("Size: "+size);
		System.out.println("Maximum Value: "+Collections.max(pricelist));
		System.out.println("Mimum Value: "+Collections.min(pricelist));
		
			}
}
