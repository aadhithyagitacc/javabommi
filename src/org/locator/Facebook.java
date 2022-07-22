package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadhi\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();

	WebElement txtuser = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
	txtuser.sendKeys("bommi@123");
	
	WebElement txtpass = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
	txtpass.sendKeys("bommi");
	
	WebElement txtlogin= driver.findElement(By.name("login"));
	txtlogin.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
