package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartripTask4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadhi\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	String title = driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	
	WebElement txtfrom = driver.findElement(By.xpath("//input[@type='text']"));
	txtfrom.sendKeys("trichy");

	WebElement txtto= driver.findElement(By.xpath("//input[@type='text']"));
	txtto.sendKeys("chennai");

	WebElement txtsearch= driver.findElement(By.id("trainFormButton"));
	txtsearch.click();







}
}
