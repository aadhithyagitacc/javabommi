package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationSelenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadhi\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	String title = driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	
	
	
	WebElement txtname = driver.findElement(By.id("heading201"));
	txtname.click();
	WebElement txttcs = driver.findElement(By.xpath("//a[@title='Model Resume training in chennai']"));
	Thread.sleep(5000);
	txttcs.click();


	
	

}
}
