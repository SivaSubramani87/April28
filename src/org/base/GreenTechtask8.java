package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechtask8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SleniumDay3\\Driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement cmdclick = driver.findElement(By.id("heading201"));
	
	
	
	cmdclick.click();
	
	
	WebElement txtcon = driver.findElement(By.xpath("//a[contains(text(),'Resume Model-1 ')]"));
	
	txtcon.click();
	
	
	
	
}
}
