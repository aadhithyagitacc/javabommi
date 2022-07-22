package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountGoogleTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadhi\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	String title = driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	
	WebElement txtname = driver.findElement(By.id("firstName"));
	txtname.sendKeys("Aadhithya");

	WebElement txtlastname= driver.findElement(By.name("lastName"));
	txtlastname.sendKeys("Rajasekar");

	WebElement txtemail= driver.findElement(By.xpath("//input[@type='whsOnd zHQBf']"));
	txtemail.sendKeys("aadhithya");

	WebElement txtpass= driver.findElement(By.xpath("//input[@type='password']"));
	txtpass.sendKeys("aadh234");
	
	System.out.println("bommiiiii");
	
	
}
}
