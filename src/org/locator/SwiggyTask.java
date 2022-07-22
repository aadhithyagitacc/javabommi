package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadhi\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	String title = driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	
	
	WebElement txtsign = driver.findElement(By.className("r2iyh"));
	txtsign.click();
	
	WebElement txtmob = driver.findElement(By.name("mobile"));
	txtmob.sendKeys("87654478887");
	
	WebElement txtname = driver.findElement(By.name("name"));
	txtname.sendKeys("Aadhi");


	WebElement txtemail= driver.findElement(By.name("email"));
	txtemail.sendKeys("bommi@456gmail.com");

	WebElement txtpass= driver.findElement(By.name("password"));
	txtpass.sendKeys("rdhtfjg");

}
}
