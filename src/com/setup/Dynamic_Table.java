package com.setup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {
	static int Wicket, Pts;
	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Seleniumsetup\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=ipl+table&oq=ipl+&aqs=chrome.0.69i59l3j69i57j69i60l2.2078j0j4&sourceid=chrome&ie=UTF-8#sie=lg;/g/11fqtnjjg0;5;/m/03b_lm1;st;fp;1;;");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> allheader = driver.findElements(By.xpath("//table[@class='Jzru1c']/tbody/tr/th"));
		for(int i=0;i<allheader.size();i++) {
			String text = allheader.get(i).getText();
		//	System.out.println(i);
			
			if(text.equalsIgnoreCase("CSK")) {
				 Wicket = i;
				System.out.println("Total wicker: "+Wicket);
				
			}else if(text.equalsIgnoreCase("MI")){
				
				Pts=i;
				System.out.println("Total points:" +Pts);
				}
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              List<WebElement> allrow = driver.findElements(By.xpath("//table[@class='Jzru1c']/thread/tr/"));
              
              
              
			
		}
		
		
	

}
}
