package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraTask13 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	
	WebElement findElement = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
	
	
	findElement.sendKeys("8870292823");
	
	WebElement findElement2 = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	
	
	
	findElement2.click();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
