package com.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Seleniumsetup\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?hl=en&passive=true&continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F8494%3Fhl%3Den%26co%3DGENIE.Platform%253DDesktop&ec=GAZAdQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement id = driver.findElement(By.id("identifierId"));
id.sendKeys("Balajiloging@gmail.com");

WebElement name = driver.findElement(By.name("V67aGc"));
name.click();

}
}