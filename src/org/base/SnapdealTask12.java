package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealTask12 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
	
WebElement findElement = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	
	findElement.click();
	
	WebElement findElement2 = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
	
	
	findElement2.click();
	
	WebElement findElement3 = driver.findElement(By.id("userName"));
	
	findElement3.sendKeys("sivadarwin1996@gmail.com");
	
	
	
	
	
	
	
	
}
}
