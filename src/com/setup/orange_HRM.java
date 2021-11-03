package com.setup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class orange_HRM {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Seleniumsetup\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		Select s= new Select(driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
    	s.selectByVisibleText("Admin");
	    driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Jasmine Morgan");
	    driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("Balaji sq");
	    Select s1= new Select(driver.findElement(By.xpath("//Select[@id='systemUser_status']")));
	    s1.selectByVisibleText("Disabled");
	    driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("Balaji@03");
	    driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("Balaji@03");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	    
		

	    List<WebElement> allHead = driver.findElements(By.xpath("//table[@id='resultTable']//th"));
	   System.out.println(allHead.size());
	    for(WebElement header:allHead) {
	    	String value=header.getText();
	    	System.out.println(value);
	    	
//	    	for(int i=0;i<allHead.size();i++) {
//	    		String text = allHead.get(i).getText();
//	    		System.out.println(text);
	    		
	    	
	    }
	    
	    	
	    }
	    	
	
	
	
	
	
}
