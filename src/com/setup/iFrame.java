package com.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public class Action {

	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Seleniumsetup\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("iframe count" +size);
		WebElement signIn = driver.findElement(By.xpath("//div[@id='signin-block']"));
		signIn.click();
		WebElement logIn= driver.findElement(By.id("signInLink"));
		logIn.click();
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame1);
		WebElement mobNum= driver.findElement(By.xpath("//input[@type='number']"));
		mobNum.sendKeys("9597598498");
		driver.switchTo().defaultContent();
		WebElement close= driver.findElement(By.xpath("//i[@class='icon-close']"));
		close.click();
		
		
		
		
		
		
}
}
