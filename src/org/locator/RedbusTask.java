package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadhi\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	String title = driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	
	WebElement txtsign= driver.findElement(By.xpath("//div[@id='signin-block']"));
	txtsign.click();

	WebElement txt= driver.findElement(By.xpath("//div[@class='hid-config-sign hide']"));
	txt.click();

	WebElement txtnum= driver.findElement(By.xpath("//div[@class='mobileInputContainer clearfix contact-box']"));
	txtnum.sendKeys("9578865432");


	       
		
	  
	}

	
  
}
