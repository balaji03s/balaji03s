package com.setup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionRobot {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Seleniumsetup\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions bs = new Actions(driver);
		Robot rs = new Robot();
		
		WebElement mob = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));                
		bs.contextClick(mob).perform();
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
   
		WebElement best = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));                
		bs.contextClick(best).perform();
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
}
}
