package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTask3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadhi\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	String title = driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	
	WebElement txtname = driver.findElement(By.xpath("//input[@type='text']"));
	txtname.sendKeys("Aadhithya");

	WebElement txtlastname= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	txtlastname.sendKeys("Rajasekar");

	WebElement txtemail= driver.findElement(By.xpath("//input[@type='email']"));
	txtemail.sendKeys("aadhi@gmail.com");
	
	WebElement txtphone= driver.findElement(By.xpath("//input[@type='tel']"));
	txtphone.sendKeys("9867457864");
	
	
	WebElement txtgender= driver.findElement(By.xpath("//input[@type='radio']"));
	txtgender.click();
	
	
	
	
	
	



}
}
