package com.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_Practices {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Seleniumsetup\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	
	WebElement signIn = driver.findElement(By.className("login"));
	signIn.click();
	WebElement emailAdd = driver.findElement(By.id("email_create"));
	emailAdd.sendKeys("Balajiloging@gmail.com");
	WebElement ctrBtn = driver.findElement(By.xpath("//i[@class='icon-user left']"));
	ctrBtn.click();
	Thread.sleep(3000);
	WebElement radio1 = driver.findElement(By.xpath("//input[@id='id_gender1']"));
    radio1.click();
    WebElement fname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
	fname.sendKeys("Balaji");
	WebElement lname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
	lname.sendKeys("S");
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("Green@03");
    WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
	Select d1 = new Select(day);
	d1.selectByValue("20");
	WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
	Select d2=new Select(month);
	d2.selectByIndex(3);
	WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
	Select d3=new Select(year);
	d3.selectByValue("1990");
	WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
	company.sendKeys("Green Technology");
	driver.findElement(By.id("address1")).sendKeys("No.27, Annai sathiya nagar");
	driver.findElement(By.id("address2")).sendKeys("Red Building");
	driver.findElement(By.id("city")).sendKeys("Chennai");
	WebElement state = driver.findElement(By.id("id_state"));
	Select s= new Select(state);
	s.selectByVisibleText("Alaska");
	driver.findElement(By.id("postcode")).sendKeys("54945");
	WebElement country = driver.findElement(By.id("id_country"));
	Select s1=new Select(country);
	s1.selectByVisibleText("United States");
	driver.findElement(By.className("form-control")).sendKeys("Nill");
	driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("45678932");
	driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("9597598498");
	driver.findElement(By.xpath("//input[@value='My address']")).sendKeys("Same Address");
	driver.findElement(By.xpath("(//span[normalize-space()='Register'])[1]")).click();
	driver.findElement(By.xpath("(//a[@title='Dresses'][normalize-space()='Dresses'])[2]")).click();
	driver.findElement(By.xpath("(//a[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!'][normalize-space()='Evening Dresses'])[1]")).click();
	driver.findElement(By.xpath("//a[@class='quick-view']")).click();
	driver.switchTo().frame("fancybox-frame1633191736705");
	driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
	driver.findElement(By.xpath("//p//span[contains(text(),'Proceed to checkout')]")).click();
	
	
	
	
	
	
	
	
	
	
	
	}
	
}	
