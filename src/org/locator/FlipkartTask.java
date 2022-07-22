package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTask {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadhi\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.flipkart.com/");
	String title = driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	
	WebElement txtNUM = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	txtNUM.sendKeys("98753578755");

	WebElement txtpass= driver.findElement(By.xpath("//input[@type='password']"));
	txtpass.sendKeys("bommi23");

	WebElement txtlogin= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	txtlogin.click();

}
}
