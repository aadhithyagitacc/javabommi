package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontask1 {
public static  void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadhi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
	
	
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");

String title = driver.getTitle();
System.out.println(title);
driver.manage().window().maximize();

WebElement txtsearch= driver.findElement(By.id("twotabsearchtextbox"));

txtsearch.sendKeys("Iphone");









	
	
	
	
	
	
}
}
