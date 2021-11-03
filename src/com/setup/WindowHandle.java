package com.setup;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Seleniumsetup\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
	WebElement Clk = driver.findElement(By.xpath("//a[@target='_blank']"));
	Clk.click();
	String win=driver.getWindowHandle();
	 String tit=driver.switchTo().window(win).getTitle();
	 System.out.println(tit);
	 
	 Set<String> wins = driver.getWindowHandles();
	 for(String str:wins) {
		 String active= driver.switchTo().window(str).getTitle();
		 System.out.println(active);
		 driver.close();
	 }
	 
	 driver.switchTo().window(win);
	
	 }
	 
	 
	 }
	 
		 
		
	 