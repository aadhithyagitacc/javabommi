package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadhi\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	String title = driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	
	WebElement txtnum= driver.findElement(By.xpath ("//input[@autocomplete='new-password']"));
	txtnum.sendKeys("6374337664");

	WebElement txtlogin= driver.findElement(By.xpath ("//div[@class='submitButtomOption']"));
	txtlogin.click();

	

}
}
