package com.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Practices2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Seleniumsetup\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Balajiloging@gmail.com");
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Green@03");
	driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[text()='Dresses'])[2]")).click();
	
	
	
	
	}

}
